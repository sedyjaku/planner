package cz.sedy.planner.model.controller.request

import java.time.Duration
import java.time.Instant

data class EvaluationRequest(

        val start: Instant,

        val end: Instant,

        val duration: Duration,

        val activityPrototypeId: String,

        val solved: Boolean,

        val planId: String
)