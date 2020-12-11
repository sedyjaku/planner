package cz.sedy.planner.model.command

import cz.sedy.planner.model.enum.ActivityType

data class ActivityPrototypeCreateCommand(

        val type: ActivityType,

        val name: String,

        val description: String
)