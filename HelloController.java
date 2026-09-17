package com.example.demo_kubernates.controller;

import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {

    @GetMapping(value = "/", produces = MediaType.TEXT_HTML_VALUE)
    public String hello() {
        return "<h1>Ciao Giovanni!</h1>" +
                "<img src=\"/images/mario.gif\" alt=\"gif di Mario Peto\" />";
    }
}