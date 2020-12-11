package cz.sedy.planner.model.controller.response

import cz.sedy.planner.model.enum.ActivityType

data class ActivityPrototypeResponse(

        val id: String,

        val type: ActivityType,

        val name: String,

        val description: String
)