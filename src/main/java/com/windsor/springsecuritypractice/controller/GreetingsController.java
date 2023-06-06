package com.windsor.springsecuritypractice.controller;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class GreetingsController {

    @GetMapping("/greetings")
    public ResponseEntity<String> sayHello() {
        return ResponseEntity.ok("Hello from our API");
    }

    @GetMapping("/goodbye")
    public ResponseEntity<String> sayGoodBye() {
        return ResponseEntity.ok("Good Bye from our API");
    }
}
