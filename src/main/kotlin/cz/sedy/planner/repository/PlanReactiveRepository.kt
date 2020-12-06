package cz.sedy.planner.repository

import cz.sedy.planner.model.domain.Plan
import org.springframework.data.mongodb.repository.ReactiveMongoRepository

interface PlanReactiveRepository : ReactiveMongoRepository<Plan, String>