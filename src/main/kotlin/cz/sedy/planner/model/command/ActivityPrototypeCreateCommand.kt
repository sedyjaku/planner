package cz.sedy.planner.model.command

data class ActivityPrototypeCreateCommand(

        val name: String,

        val description: String,

        val type: String,
)