package com.example.demo.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import sun.jvm.hotspot.HelloWorld;

@RestController
public class HelloController {
    private final static Logger logger = LoggerFactory.getLogger(HelloController.class);
    @GetMapping("/hello")
    public String hello(){
        logger.info("slf4j + logback.......");
        return "Hello.";
    }
}
