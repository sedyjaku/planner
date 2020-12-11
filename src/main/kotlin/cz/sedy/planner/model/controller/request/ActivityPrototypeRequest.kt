package cz.sedy.planner.model.controller.request

import cz.sedy.planner.model.enum.ActivityType

data class ActivityPrototypeRequest(

        val type: ActivityType,

        val name: String,

        val description: String
)