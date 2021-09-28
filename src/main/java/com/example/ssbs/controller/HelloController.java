package com.example.ssbs.controller;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {

    @GetMapping("/")
    public ResponseEntity sayHello() {
        return ResponseEntity.ok("Hello from version 1.0");
    }
}
