package cz.sedy.planner.model.controller.request

import java.time.Duration
import java.time.Instant

data class PlanRequest(

        val planStart: Instant,

        val planEnd: Instant,

        val duration: Duration,

        val activityPrototypeId: String,

        val solved: Boolean,

        val evaluationId: String
)