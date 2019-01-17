package com.ladyishenlong.zonegateway.test

import org.springframework.cloud.openfeign.FeignClient
import org.springframework.stereotype.Repository
import org.springframework.web.bind.annotation.GetMapping

@Repository
@FeignClient(name = "zone-test")
interface TestService {

    @GetMapping("/zonetest-test/test")
    fun test(): TestModel

}