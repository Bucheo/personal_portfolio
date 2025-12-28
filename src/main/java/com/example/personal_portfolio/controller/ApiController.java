package com.example.personal_portfolio.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.time.LocalDateTime;

import org.springframework.web.bind.annotation.GetMapping;


@RestController
@RequestMapping("/api")
public class ApiController {

    @GetMapping("/server/time")
    public String serverTime() {
        //log.info("serverTime");
        return LocalDateTime.now().toString();
    }
    
}
