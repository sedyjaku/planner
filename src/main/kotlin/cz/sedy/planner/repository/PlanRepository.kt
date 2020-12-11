package cz.sedy.planner.repository

import cz.sedy.planner.model.domain.Plan
import org.springframework.data.mongodb.repository.ReactiveMongoRepository

interface PlanRepository : ReactiveMongoRepository<Plan, String>