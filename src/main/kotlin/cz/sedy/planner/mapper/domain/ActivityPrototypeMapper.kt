package cz.sedy.planner.mapper.domain

import cz.sedy.planner.config.MappingConfig
import cz.sedy.planner.model.command.ActivityPrototypeCreateCommand
import cz.sedy.planner.model.command.ActivityPrototypeUpdateCommand
import cz.sedy.planner.model.domain.ActivityPrototype
import org.mapstruct.Mapper
import org.mapstruct.MappingTarget

@Mapper(config = MappingConfig::class)
interface ActivityPrototypeMapper {

    fun createFromCommand(createCommand: ActivityPrototypeCreateCommand): ActivityPrototype

    fun updateByCommand(@MappingTarget activityPrototype: ActivityPrototype, updateCommand: ActivityPrototypeUpdateCommand)
}
