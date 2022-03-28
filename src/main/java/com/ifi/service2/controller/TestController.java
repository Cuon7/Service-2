package com.ifi.service2.controller;

import org.springframework.web.bind.annotation.RequestHeader;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/service2")
public class TestController {
    @RequestMapping("/message")
    public String sayHello(@RequestHeader("second-request") String header) {
        return "Hello from service 2 " + "" + header;
    }
}
