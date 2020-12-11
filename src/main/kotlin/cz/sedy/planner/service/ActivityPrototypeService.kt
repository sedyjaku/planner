package cz.sedy.planner.service

import cz.sedy.planner.model.command.ActivityPrototypeCreateCommand
import cz.sedy.planner.model.command.ActivityPrototypeUpdateCommand
import cz.sedy.planner.model.domain.ActivityPrototype
import kotlinx.coroutines.flow.Flow

interface ActivityPrototypeService {
    fun getAll(): Flow<ActivityPrototype>

    suspend fun getById(id: String): ActivityPrototype

    suspend fun createActivityPrototype(createCommand: ActivityPrototypeCreateCommand): ActivityPrototype

    suspend fun updateActivityPrototype(updateCommand: ActivityPrototypeUpdateCommand): ActivityPrototype

    suspend fun deleteById(id: String)
}