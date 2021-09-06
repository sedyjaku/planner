package cz.sedy.planner.mapper.command

import cz.sedy.planner.config.MappingConfig
import cz.sedy.planner.model.command.EvaluationUpdateCommand
import cz.sedy.planner.model.controller.request.EvaluationRequest
import org.mapstruct.Mapper
import org.mapstruct.Mapping

@Mapper(config = MappingConfig::class)
interface EvaluationUpdateCommandMapper {

    @Mapping(target = "id", source = "evaluationId")
    fun createFromRequest(request: EvaluationRequest, evaluationId: String): EvaluationUpdateCommand
}
