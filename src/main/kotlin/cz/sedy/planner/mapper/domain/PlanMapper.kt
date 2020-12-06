package cz.sedy.planner.mapper.domain

import cz.sedy.planner.model.command.PlanCreateCommand
import cz.sedy.planner.model.domain.Plan
import org.mapstruct.Mapper

@Mapper
interface PlanMapper {

    fun createFromCreateCommand(createCommand: PlanCreateCommand): Plan
}
