package com.demo.springbooteksecr;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class DemoController {

    @GetMapping("/greetings")
    public String greetings()
    {
        return "Hello from AWS EKS Container...";
    }
}
