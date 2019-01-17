package com.ladyishenlong.zonegateway.flux

import org.springframework.beans.factory.annotation.Autowired
import org.springframework.context.annotation.Bean
import org.springframework.context.annotation.Configuration
import org.springframework.stereotype.Component
import org.springframework.web.reactive.function.server.HandlerFunction
import org.springframework.web.reactive.function.server.RouterFunction
import org.springframework.web.reactive.function.server.ServerResponse
import  org.springframework.web.reactive.function.server.RequestPredicates.GET
import org.springframework.web.reactive.function.server.RouterFunctions.route

/**
 * flux 方式的接口写法
 */
@Component
class RouterConfig {

    @Autowired
    private lateinit var timeHandler: TimeHandler



    @Bean
    fun timerRouter(): RouterFunction<ServerResponse> =
            route<ServerResponse>(GET("/time"), HandlerFunction<ServerResponse> { timeHandler.getTime(it) })
                    .andRoute(GET("/date"), HandlerFunction<ServerResponse> { timeHandler.getDate(it) })
}