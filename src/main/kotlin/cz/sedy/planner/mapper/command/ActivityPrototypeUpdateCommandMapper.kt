package cz.sedy.planner.mapper.command

import cz.sedy.planner.config.MappingConfig
import cz.sedy.planner.model.command.ActivityPrototypeUpdateCommand
import cz.sedy.planner.model.controller.request.ActivityPrototypeRequest
import org.mapstruct.Mapper
import org.mapstruct.Mapping

@Mapper(config = MappingConfig::class)
interface ActivityPrototypeUpdateCommandMapper {

    @Mapping(target = "id", source = "activityPrototypeId")
    fun createFromRequest(
        request: ActivityPrototypeRequest,
        activityPrototypeId: String
    ): ActivityPrototypeUpdateCommand
}
