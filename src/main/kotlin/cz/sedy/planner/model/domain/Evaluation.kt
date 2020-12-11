package cz.sedy.planner.model.domain

import cz.sedy.planner.model.Identified
import org.springframework.data.annotation.Id
import org.springframework.data.mongodb.core.mapping.Document
import java.time.Duration
import java.time.Instant

@Document
data class Evaluation(

        @Id
        override val id: String?,

        val start: Instant,

        val end: Instant,

        val duration: Duration,

        val activityPrototypeId: String,

        val solved: Boolean,

        val planId: String
) : Identified