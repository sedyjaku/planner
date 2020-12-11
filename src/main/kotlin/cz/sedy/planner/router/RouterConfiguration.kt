package cz.sedy.planner.router

import ACTIVITY_PROTOTYPE_ENDPOINT
import cz.sedy.planner.handler.ActivityPrototypeHandler
import kotlinx.coroutines.FlowPreview
import org.springframework.context.annotation.Bean
import org.springframework.context.annotation.Configuration
import org.springframework.web.reactive.function.server.coRouter

@Configuration
class RouterConfiguration {


    @FlowPreview
    @Bean
    fun activityPrototypeRoutes(handler: ActivityPrototypeHandler) = coRouter {
        path("/$ACTIVITY_PROTOTYPE_ENDPOINT")
        GET("", handler::getAll)
        GET("/{id}", handler::getById)
        POST("", handler::createActivityPrototype)
        PUT("/{id}", handler::updateActivityPrototype)
        DELETE("/{id}", handler::deleteActivityPrototype)
    }
}