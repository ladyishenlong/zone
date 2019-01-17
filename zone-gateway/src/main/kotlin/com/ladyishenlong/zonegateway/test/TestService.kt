package com.ladyishenlong.zonegateway.test

import org.springframework.cloud.openfeign.FeignClient
import org.springframework.stereotype.Repository
import org.springframework.web.bind.annotation.GetMapping

/**
 * FeignClient 的 name 是被调用端的 spring.application.name
 *
 */
@Repository
@FeignClient(name = "zone-test")
interface TestService {

    /**
     * 这里的地址是远端 controller 的地址一致
     */
    @GetMapping("/zonetest-test/test")
    fun test(): TestModel

}