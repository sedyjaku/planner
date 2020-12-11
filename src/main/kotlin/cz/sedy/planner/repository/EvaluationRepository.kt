package cz.sedy.planner.repository

import cz.sedy.planner.model.domain.Evaluation
import org.springframework.data.mongodb.repository.ReactiveMongoRepository

interface EvaluationRepository : ReactiveMongoRepository<Evaluation, String>