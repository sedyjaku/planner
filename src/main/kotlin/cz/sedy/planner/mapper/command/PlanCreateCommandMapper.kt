package cz.sedy.planner.mapper.command

import cz.sedy.planner.model.controller.request.PlanRequest
import cz.sedy.planner.model.command.PlanCreateCommand
import org.mapstruct.Mapper

@Mapper
interface PlanCreateCommandMapper {

    fun createFromRequest(request: PlanRequest): PlanCreateCommand
}
