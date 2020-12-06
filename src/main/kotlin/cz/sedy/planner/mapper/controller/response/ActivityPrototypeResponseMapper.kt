package cz.sedy.planner.mapper.controller.response

import cz.sedy.planner.model.domain.ActivityPrototype
import cz.sedy.planner.model.controller.response.ActivityPrototypeResponse
import org.mapstruct.Mapper

@Mapper
interface ActivityPrototypeResponseMapper {

	fun createFromDomain(domain: ActivityPrototype): ActivityPrototypeResponse
}
