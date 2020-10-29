package com.example.feign.client;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.RequestMapping;

@FeignClient(name = "feign-server")
@RequestMapping
public interface RemoteApi {
    @RequestMapping("/server/test")
    String test();
}
