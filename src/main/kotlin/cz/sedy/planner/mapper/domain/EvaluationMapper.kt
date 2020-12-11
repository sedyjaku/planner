package cz.sedy.planner.mapper.domain

import cz.sedy.planner.config.MappingConfig
import cz.sedy.planner.model.command.EvaluationCreateCommand
import cz.sedy.planner.model.domain.Evaluation
import org.mapstruct.Mapper

@Mapper(config = MappingConfig::class)
interface EvaluationMapper {

    fun createFromCreateCommand(createCommand: EvaluationCreateCommand): Evaluation
}
