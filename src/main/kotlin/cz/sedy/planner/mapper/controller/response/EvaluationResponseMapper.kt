package cz.sedy.planner.mapper.controller.response

import cz.sedy.planner.config.MappingConfig
import cz.sedy.planner.model.controller.response.EvaluationResponse
import cz.sedy.planner.model.domain.Evaluation
import org.mapstruct.Mapper

@Mapper(config = MappingConfig::class)
interface EvaluationResponseMapper {

    fun createFromDomain(domain: Evaluation): EvaluationResponse
}
