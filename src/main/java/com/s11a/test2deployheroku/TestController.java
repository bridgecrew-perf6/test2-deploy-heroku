package com.s11a.test2deployheroku;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TestController {
    @GetMapping(value = "/home")
    public String home() {
        return "Hello heroku-deployment";
    }
}
