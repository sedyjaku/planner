package cz.sedy.planner.model.controller.response

import cz.sedy.planner.model.enum.ActivityType
import org.springframework.data.annotation.Id
import org.springframework.data.mongodb.core.mapping.Document

data class ActivityPrototypeResponse(

        val id: String,

        val type: ActivityType,

        val name: String,

        val description: String
)