package cz.sedy.planner.mapper.domain

import cz.sedy.planner.model.command.ActivityPrototypeCreateCommand
import cz.sedy.planner.model.domain.ActivityPrototype
import org.mapstruct.Mapper

@Mapper
interface ActivityPrototypeMapper {

    fun createFromCreateCommand(createCommand: ActivityPrototypeCreateCommand): ActivityPrototype
}
