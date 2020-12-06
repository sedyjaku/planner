package cz.sedy.planner.mapper.command

import cz.sedy.planner.model.controller.request.PlanRequest
import cz.sedy.planner.model.command.PlanUpdateCommand
import org.mapstruct.Mapper

@Mapper
interface PlanUpdateCommandMapper {

    fun createFromRequest(request: PlanRequest, id: String): PlanUpdateCommand
}
