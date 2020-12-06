package cz.sedy.planner.model.controller.request

import cz.sedy.planner.model.enum.ActivityType
import org.springframework.data.annotation.Id
import org.springframework.data.mongodb.core.mapping.Document

data class ActivityPrototypeRequest(

        val type: ActivityType,

        val name: String,

        val description: String
)