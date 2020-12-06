package cz.sedy.planner.model.command

import cz.sedy.planner.model.enum.ActivityType
import org.springframework.data.annotation.Id
import org.springframework.data.mongodb.core.mapping.Document

data class ActivityPrototypeUpdateCommand(

        val id: String,

        val type: ActivityType,

        val name: String,

        val description: String
)