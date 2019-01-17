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

/**
 * @Component	最普通的组件，可以被注入到spring容器进行管理
 * @Repository	作用于持久层
 * @Service	作用于业务逻辑层
 * @Controller	作用于表现层（spring-mvc的注解）
 * */