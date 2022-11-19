package com.example.general.dev.controller;

import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api")
public class GeneralApi {

    @GetMapping("/hello")
    public String hellWorld() {
        return "Hello Mate";
    }

    @GetMapping("/hello/member")
    public String hellWorld(@RequestParam String name) {
        return "Hello:" + name ;
    }
}
