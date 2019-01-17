package com.ladyishenlong.zonegateway

import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication
import org.springframework.cloud.client.discovery.EnableDiscoveryClient
import org.springframework.cloud.netflix.eureka.EnableEurekaClient
import org.springframework.cloud.openfeign.EnableFeignClients

/**
 * 这里是网关
 */
@EnableFeignClients
@EnableEurekaClient
@SpringBootApplication
class ZoneGatewayApplication

fun main(args: Array<String>) {
    runApplication<ZoneGatewayApplication>(*args)
}

