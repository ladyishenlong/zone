package com.ladyishenlong.zonetest.test

import org.springframework.beans.factory.annotation.Autowired
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.RestController
import reactor.core.publisher.Mono
import javax.ws.rs.GET

@RestController
class TestController {


    @GetMapping("/zonetest-test/test")
    fun test(): Mono<TestModel> = Mono.just(TestModel())

}