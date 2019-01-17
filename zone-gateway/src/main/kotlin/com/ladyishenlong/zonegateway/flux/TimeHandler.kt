package com.ladyishenlong.zonegateway.flux

import org.springframework.http.MediaType
import org.springframework.stereotype.Component
import org.springframework.web.reactive.function.server.ServerRequest
import org.springframework.web.reactive.function.server.ServerResponse
import reactor.core.publisher.Mono
import org.springframework.web.reactive.function.server.ServerResponse.ok
import java.text.SimpleDateFormat
import java.util.*

@Component
class TimeHandler {


    fun getTime(serverRequest: ServerRequest): Mono<ServerResponse> = ok()
            .contentType(MediaType.TEXT_PLAIN)
            .body(Mono.just("当前时间：${SimpleDateFormat("HH:mm:ss").format(Date())}"), String::class.java)

    fun getDate(serverRequest: ServerRequest): Mono<ServerResponse> = ok()
            .contentType(MediaType.TEXT_PLAIN)
            .body(Mono.just("当前日期：${SimpleDateFormat("yyyy-MM-dd").format(Date())}"), String::class.java)


}