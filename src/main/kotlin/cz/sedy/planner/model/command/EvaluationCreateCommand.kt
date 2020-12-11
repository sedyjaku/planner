package cz.sedy.planner.model.command

import java.time.Duration
import java.time.Instant

data class EvaluationCreateCommand(

        val start: Instant,

        val end: Instant,

        val duration: Duration,

        val activityPrototypeId: String,

        val solved: Boolean,

        val planId: String
)