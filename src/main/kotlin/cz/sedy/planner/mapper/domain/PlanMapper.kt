package cz.sedy.planner.mapper.domain

import cz.sedy.planner.config.MappingConfig
import cz.sedy.planner.model.command.PlanCreateCommand
import cz.sedy.planner.model.domain.Plan
import org.mapstruct.Mapper

@Mapper(config = MappingConfig::class)
interface PlanMapper {

    fun createFromCreateCommand(createCommand: PlanCreateCommand): Plan
}
