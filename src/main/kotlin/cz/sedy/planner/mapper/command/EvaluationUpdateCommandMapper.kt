package cz.sedy.planner.mapper.command

import cz.sedy.planner.model.controller.request.EvaluationRequest
import cz.sedy.planner.model.command.EvaluationUpdateCommand
import org.mapstruct.Mapper

@Mapper
interface EvaluationUpdateCommandMapper {

	fun createFromRequest(request: EvaluationRequest, id: String): EvaluationUpdateCommand
}
