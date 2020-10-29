package com.example.feign.client;

import org.springframework.cloud.openfeign.EnableFeignClients;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

/**
 * @description:
 * @author: lin.guo
 * @create: 2020-10-12 16:24
 **/
@RestController
public class TestController {

    @Resource
    private RemoteApi remoteApi;

    @RequestMapping("/client/test")
    public String test(){
        return remoteApi.test();
    }

    public static void main(String[] args) {
        System.out.println(EnableFeignClients.class.getName());
        System.out.println(FeignClient.class.getCanonicalName());
    }
}
