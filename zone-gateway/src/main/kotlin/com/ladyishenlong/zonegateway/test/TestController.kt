package com.ladyishenlong.zonegateway.test

import org.springframework.beans.factory.annotation.Autowired
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.RestController
import reactor.core.publisher.Mono
import javax.ws.rs.GET

@RestController
class TestController {

    @Autowired
    lateinit var testService: TestService

    @GetMapping("/test")
    fun test(): Mono<TestModel> = Mono.just(testService.test())

}