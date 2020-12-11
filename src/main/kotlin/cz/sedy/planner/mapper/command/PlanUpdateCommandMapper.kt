package cz.sedy.planner.mapper.command

import cz.sedy.planner.config.MappingConfig
import cz.sedy.planner.model.command.PlanUpdateCommand
import cz.sedy.planner.model.controller.request.PlanRequest
import org.mapstruct.Mapper

@Mapper(config = MappingConfig::class)
interface PlanUpdateCommandMapper {

    fun createFromRequest(request: PlanRequest, id: String): PlanUpdateCommand
}
