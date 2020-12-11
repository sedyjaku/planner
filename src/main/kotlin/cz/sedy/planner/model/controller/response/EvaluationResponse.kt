package cz.sedy.planner.model.controller.response

import java.time.Duration
import java.time.Instant

data class EvaluationResponse(

        val id: String,

        val start: Instant,

        val end: Instant,

        val duration: Duration,

        val activityPrototypeId: String,

        val solved: Boolean,

        val planId: String
)