package cz.sedy.planner.mapper.domain

import cz.sedy.planner.model.command.EvaluationCreateCommand
import cz.sedy.planner.model.domain.Evaluation
import org.mapstruct.Mapper

@Mapper
interface EvaluationMapper {

    fun createFromCreateCommand(createCommand: EvaluationCreateCommand): Evaluation
}
