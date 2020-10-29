package com.example.feign.server;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @description:
 * @author: lin.guo
 * @create: 2020-10-12 16:14
 **/
@RestController
public class TestController {

    @RequestMapping("/server/test")
    public String test(){
        return "this is a openfeign test";
    }
}
