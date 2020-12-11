package cz.sedy.planner.mapper.command

import cz.sedy.planner.config.MappingConfig
import cz.sedy.planner.model.command.EvaluationCreateCommand
import cz.sedy.planner.model.controller.request.EvaluationRequest
import org.mapstruct.Mapper

@Mapper(config = MappingConfig::class)
interface EvaluationCreateCommandMapper {

    fun createFromRequest(request: EvaluationRequest): EvaluationCreateCommand
}
