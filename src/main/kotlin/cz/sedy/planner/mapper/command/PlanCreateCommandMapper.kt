package cz.sedy.planner.mapper.command

import cz.sedy.planner.config.MappingConfig
import cz.sedy.planner.model.command.PlanCreateCommand
import cz.sedy.planner.model.controller.request.PlanRequest
import org.mapstruct.Mapper

@Mapper(config = MappingConfig::class)
interface PlanCreateCommandMapper {

    fun createFromRequest(request: PlanRequest): PlanCreateCommand
}
