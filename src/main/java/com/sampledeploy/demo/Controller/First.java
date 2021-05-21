package com.sampledeploy.demo.Controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api")
public class First {

    @GetMapping("/first")
    public String display() {
        System.out.println("First Deploy");
        return "First Deploy";
    }
}
