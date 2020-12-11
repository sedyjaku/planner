package cz.sedy.planner.service.impl

import cz.sedy.planner.exception.NotFoundException
import cz.sedy.planner.mapper.domain.ActivityPrototypeMapper
import cz.sedy.planner.model.command.ActivityPrototypeCreateCommand
import cz.sedy.planner.model.command.ActivityPrototypeUpdateCommand
import cz.sedy.planner.model.domain.ActivityPrototype
import cz.sedy.planner.repository.ActivityPrototypeRepository
import cz.sedy.planner.service.ActivityPrototypeService
import kotlinx.coroutines.flow.Flow
import kotlinx.coroutines.reactive.asFlow
import kotlinx.coroutines.reactive.awaitFirstOrElse
import kotlinx.coroutines.reactive.awaitSingle
import org.springframework.stereotype.Service

@Service
class DefaultActivityPrototypeService(

        private val activityPrototypeRepository: ActivityPrototypeRepository,
        private val activityPrototypeMapper: ActivityPrototypeMapper
) : ActivityPrototypeService {

    override fun getAll(): Flow<ActivityPrototype> =
            activityPrototypeRepository.findAll().asFlow()

    override suspend fun getById(id: String): ActivityPrototype =
            activityPrototypeRepository.findById(id).awaitFirstOrElse { throw NotFoundException.of(id, ActivityPrototype::class.java) }

    override suspend fun createActivityPrototype(createCommand: ActivityPrototypeCreateCommand): ActivityPrototype =
            activityPrototypeRepository.save(
                    activityPrototypeMapper.createFromCommand(createCommand)
            ).awaitSingle()

    override suspend fun updateActivityPrototype(updateCommand: ActivityPrototypeUpdateCommand): ActivityPrototype {
        val activityPrototype = activityPrototypeRepository.findById(updateCommand.id)
                .awaitFirstOrElse { throw NotFoundException.of(updateCommand.id, ActivityPrototype::class.java) }
        activityPrototypeMapper.updateByCommand(activityPrototype, updateCommand)
        return activityPrototypeRepository.save(activityPrototype).awaitSingle()
    }

    override suspend fun deleteById(id: String) {
        activityPrototypeRepository.deleteById(id).awaitFirstOrElse { throw NotFoundException.of(id, ActivityPrototype::class.java) }
    }
}