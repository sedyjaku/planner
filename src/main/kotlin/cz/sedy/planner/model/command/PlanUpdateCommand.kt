package cz.sedy.planner.model.command

import java.time.Duration
import java.time.Instant

data class PlanUpdateCommand(

        val id: String,

        val planStart: Instant,

        val planEnd: Instant,

        val duration: Duration,

        val activityPrototypeId: String,

        val solved: Boolean,

        val evaluationId: String
)