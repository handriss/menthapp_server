package com.mentha.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class StatusController {

    @GetMapping
    public String checkStatus(){
        return "Application is up and running.";
    }
}