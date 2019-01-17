package com.ladyishenlong.zone

import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer

/**
 * 这里是服务注册中心
 */
@EnableEurekaServer
@SpringBootApplication
class ZoneApplication

fun main(args: Array<String>) {
    runApplication<ZoneApplication>(*args)
}

