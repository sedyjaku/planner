package cz.sedy.planner.mapper.controller.response

import cz.sedy.planner.config.MappingConfig
import cz.sedy.planner.model.controller.response.ActivityPrototypeResponse
import cz.sedy.planner.model.domain.ActivityPrototype
import org.mapstruct.Mapper

@Mapper(config = MappingConfig::class)
interface ActivityPrototypeResponseMapper {

    fun createFromDomain(domain: ActivityPrototype): ActivityPrototypeResponse
}
