package cz.sedy.planner.repository

import cz.sedy.planner.model.domain.ActivityPrototype
import org.springframework.data.mongodb.repository.ReactiveMongoRepository

interface ActivityPrototypeReactiveRepository : ReactiveMongoRepository<ActivityPrototype, String>