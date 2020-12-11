package cz.sedy.planner.handler

import cz.sedy.planner.constant.ID_PATH_VARIABLE
import cz.sedy.planner.mapper.command.ActivityPrototypeCreateCommandMapper
import cz.sedy.planner.mapper.command.ActivityPrototypeUpdateCommandMapper
import cz.sedy.planner.mapper.controller.response.ActivityPrototypeResponseMapper
import cz.sedy.planner.model.controller.request.ActivityPrototypeRequest
import cz.sedy.planner.service.ActivityPrototypeService
import kotlinx.coroutines.flow.map
import org.springframework.stereotype.Component
import org.springframework.web.reactive.function.server.*

@Component
class ActivityPrototypeHandler(
        private val activityPrototypeService: ActivityPrototypeService,
        private val activityPrototypeResponseMapper: ActivityPrototypeResponseMapper,
        private val activityPrototypeUpdateCommandMapper: ActivityPrototypeUpdateCommandMapper,
        private val activityPrototypeCreateCommandMapper: ActivityPrototypeCreateCommandMapper
) {

    suspend fun getAll(request: ServerRequest): ServerResponse =
            ServerResponse.ok().json().bodyAndAwait(
                    activityPrototypeService.getAll()
                            .map { activityPrototypeResponseMapper::createFromDomain }
            )

    suspend fun getById(request: ServerRequest): ServerResponse =
            ServerResponse.ok().json().bodyValueAndAwait(
                    activityPrototypeResponseMapper.createFromDomain(
                            activityPrototypeService.getById(request.pathVariable(ID_PATH_VARIABLE))
                    )
            )

    suspend fun createActivityPrototype(request: ServerRequest) =
            ServerResponse.ok().json().bodyValueAndAwait(
                    activityPrototypeService.createActivityPrototype(
                            activityPrototypeCreateCommandMapper.createFromRequest(request.awaitBody(ActivityPrototypeRequest::class))
                    )
            )

    suspend fun updateActivityPrototype(request: ServerRequest) =
            ServerResponse.ok().json().bodyValueAndAwait(
                    activityPrototypeService.updateActivityPrototype(
                            activityPrototypeUpdateCommandMapper.createFromRequest(
                                    request.awaitBody(ActivityPrototypeRequest::class),
                                    request.pathVariable(ID_PATH_VARIABLE)
                            )
                    )
            )

    suspend fun deleteActivityPrototype(request: ServerRequest): ServerResponse {
        activityPrototypeService.deleteById(request.pathVariable(ID_PATH_VARIABLE))
        return ServerResponse.noContent().buildAndAwait()
    }
}