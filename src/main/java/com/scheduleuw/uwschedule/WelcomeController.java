package com.scheduleuw.uwschedule;

import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.GetMapping;

@RestController
public class WelcomeController {

    @GetMapping("/")
    public String main() {
        return "Hello, World!";
    }

}
