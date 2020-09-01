package com.example.httpclient_demo.controller;

import org.springframework.web.bind.annotation.*;

/**
 * @ClassName：HttpClient1.java
 * @Description:
 * @Date: 2020/6/10 9:29 AM
 * @Author: lin.guo
 **/
@RestController
public class HttpClient1 {

    @GetMapping("/doGetControllerOne")
    public String doGetTestOne(){
        return "get方法结果！";
    }

    @PostMapping("/doPostControllerTwo")
    public String doPostControllerTwo(@RequestBody Student student){
        return student.toString();
    }


}
