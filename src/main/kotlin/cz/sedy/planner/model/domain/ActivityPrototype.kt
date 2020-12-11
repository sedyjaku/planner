package cz.sedy.planner.model.domain

import cz.sedy.planner.model.Identified
import cz.sedy.planner.model.enum.ActivityType
import org.springframework.data.mongodb.core.mapping.Document

@Document
data class ActivityPrototype(


        override val id: String?,

        val type: ActivityType,

        val name: String,

        val description: String

) : Identified