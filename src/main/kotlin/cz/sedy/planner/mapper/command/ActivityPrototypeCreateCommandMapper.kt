package cz.sedy.planner.mapper.command

import cz.sedy.planner.model.controller.request.ActivityPrototypeRequest
import cz.sedy.planner.model.command.ActivityPrototypeCreateCommand
import org.mapstruct.Mapper

@Mapper
interface ActivityPrototypeCreateCommandMapper {

    fun createFromRequest(request: ActivityPrototypeRequest): ActivityPrototypeCreateCommand
}
