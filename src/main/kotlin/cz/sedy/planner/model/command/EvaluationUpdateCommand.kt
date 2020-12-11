package cz.sedy.planner.model.command

import java.time.Duration
import java.time.Instant

data class EvaluationUpdateCommand(

        val id: String,

        val start: Instant,

        val end: Instant,

        val duration: Duration,

        val activityPrototypeId: String,

        val solved: Boolean,

        val planId: String
)