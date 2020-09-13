package com.jansens.springcloud.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {

    @RequestMapping(value = "/service/hello",method = RequestMethod.GET)
    public String hello(){
        return "hello springCloud!";
    }
}
