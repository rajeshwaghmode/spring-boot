package com.java.learning.springboot.actuator.Controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class SimpleController {

    @GetMapping(path = "/sayHi/{name}")
    public String sayHi(@PathVariable(value = "name") String name){
        return "Hi "+ name +", Welcome to the world of SpringBoot Actuator!";
    }
}
