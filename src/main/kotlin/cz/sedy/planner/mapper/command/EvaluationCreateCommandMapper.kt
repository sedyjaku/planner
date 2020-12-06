package cz.sedy.planner.mapper.command

import cz.sedy.planner.model.controller.request.EvaluationRequest
import cz.sedy.planner.model.command.EvaluationCreateCommand
import org.mapstruct.Mapper

@Mapper
interface EvaluationCreateCommandMapper {

    fun createFromRequest(request: EvaluationRequest): EvaluationCreateCommand
}
