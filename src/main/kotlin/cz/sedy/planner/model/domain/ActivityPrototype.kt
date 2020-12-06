package cz.sedy.planner.model.domain

import cz.sedy.planner.model.enum.ActivityType
import org.springframework.data.annotation.Id
import org.springframework.data.mongodb.core.mapping.Document

@Document
data class ActivityPrototype(

        @Id
        val id: String?,

        val type: ActivityType,

        val name: String,

        val description: String

)