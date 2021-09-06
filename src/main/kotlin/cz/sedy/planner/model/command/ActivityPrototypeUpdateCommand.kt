package cz.sedy.planner.model.command

data class ActivityPrototypeUpdateCommand(

        val id: String,

        val type: String,

        val name: String,

        val description: String
)