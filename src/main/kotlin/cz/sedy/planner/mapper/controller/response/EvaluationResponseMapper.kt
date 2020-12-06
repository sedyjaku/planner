package cz.sedy.planner.mapper.controller.response

import cz.sedy.planner.model.domain.Evaluation
import cz.sedy.planner.model.controller.response.EvaluationResponse
import org.mapstruct.Mapper

@Mapper
interface EvaluationResponseMapper {

    fun createFromDomain(domain: Evaluation): EvaluationResponse
}
