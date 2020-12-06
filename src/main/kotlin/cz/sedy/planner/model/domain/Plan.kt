package cz.sedy.planner.model.domain

import org.springframework.data.annotation.Id
import org.springframework.data.mongodb.core.mapping.Document
import java.time.Duration
import java.time.Instant

@Document

data class Plan(

        @Id
        val id: String?,

        val planStart: Instant,

        val planEnd: Instant,

        val duration: Duration,

        val activityPrototypeId: String,

        val solved: Boolean,

        val evaluationId: String

)