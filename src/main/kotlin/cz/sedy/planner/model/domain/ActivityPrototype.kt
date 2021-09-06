package cz.sedy.planner.model.domain

import cz.sedy.planner.model.Identified
import org.springframework.data.mongodb.core.mapping.Document

@Document
data class ActivityPrototype(


        override val id: String?,

        val type: String,

        val name: String,

        val description: String

) : Identified