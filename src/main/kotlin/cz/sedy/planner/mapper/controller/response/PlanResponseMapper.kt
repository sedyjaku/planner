package cz.sedy.planner.mapper.controller.response

import cz.sedy.planner.config.MappingConfig
import cz.sedy.planner.model.controller.response.PlanResponse
import cz.sedy.planner.model.domain.Plan
import org.mapstruct.Mapper

@Mapper(config = MappingConfig::class)
interface PlanResponseMapper {

    fun createFromDomain(domain: Plan): PlanResponse
}
