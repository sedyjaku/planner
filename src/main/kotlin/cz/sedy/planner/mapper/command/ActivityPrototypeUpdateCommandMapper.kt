package cz.sedy.planner.mapper.command

import cz.sedy.planner.model.controller.request.ActivityPrototypeRequest
import cz.sedy.planner.model.command.ActivityPrototypeUpdateCommand
import org.mapstruct.Mapper

@Mapper
interface ActivityPrototypeUpdateCommandMapper {

	fun createFromRequest(request: ActivityPrototypeRequest, id: String): ActivityPrototypeUpdateCommand
}
