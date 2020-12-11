package cz.sedy.planner.mapper.command

import cz.sedy.planner.config.MappingConfig
import cz.sedy.planner.model.command.ActivityPrototypeUpdateCommand
import cz.sedy.planner.model.controller.request.ActivityPrototypeRequest
import org.mapstruct.Mapper

@Mapper(config = MappingConfig::class)
interface ActivityPrototypeUpdateCommandMapper {

    fun createFromRequest(request: ActivityPrototypeRequest, id: String): ActivityPrototypeUpdateCommand
}
