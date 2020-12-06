package cz.sedy.planner.mapper.controller.response

import cz.sedy.planner.model.domain.Plan
import cz.sedy.planner.model.controller.response.PlanResponse
import org.mapstruct.Mapper

@Mapper
interface PlanResponseMapper {

    fun createFromDomain(domain: Plan): PlanResponse
}
