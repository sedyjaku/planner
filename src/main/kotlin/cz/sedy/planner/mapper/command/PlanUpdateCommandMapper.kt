package cz.sedy.planner.mapper.command

import cz.sedy.planner.config.MappingConfig
import cz.sedy.planner.model.command.PlanUpdateCommand
import cz.sedy.planner.model.controller.request.PlanRequest
import org.mapstruct.Mapper
import org.mapstruct.Mapping

@Mapper(config = MappingConfig::class)
interface PlanUpdateCommandMapper {

    @Mapping(target = "id", source = "planUpdateId")
    fun createFromRequest(request: PlanRequest, planUpdateId: String): PlanUpdateCommand
}
