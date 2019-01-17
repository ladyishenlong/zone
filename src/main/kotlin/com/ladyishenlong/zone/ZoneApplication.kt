package com.ladyishenlong.zone

import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer

@EnableEurekaServer
@SpringBootApplication
class ZoneApplication

fun main(args: Array<String>) {
    runApplication<ZoneApplication>(*args)
}

