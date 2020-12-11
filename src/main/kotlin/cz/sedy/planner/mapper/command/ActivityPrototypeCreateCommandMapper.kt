package cz.sedy.planner.mapper.command

import cz.sedy.planner.config.MappingConfig
import cz.sedy.planner.model.command.ActivityPrototypeCreateCommand
import cz.sedy.planner.model.controller.request.ActivityPrototypeRequest
import org.mapstruct.Mapper

@Mapper(config = MappingConfig::class)
interface ActivityPrototypeCreateCommandMapper {

    fun createFromRequest(request: ActivityPrototypeRequest): ActivityPrototypeCreateCommand
}
