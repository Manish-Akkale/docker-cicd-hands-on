package com.myfirstproject.controller;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Map;

@RestController
@RequestMapping("/api/v1/test")
public class TestController {

    @GetMapping("/hello-world/{name}")
    public ResponseEntity<Map<String, String>> hello(@PathVariable String name) {

        Map<String, String> response = Map.of(
                "message", "Hello " + name,
                "info", "Welcome to Java world"
        );

        return ResponseEntity.ok(response);
    }
}
