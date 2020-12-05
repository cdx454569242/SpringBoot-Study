package com.project.taskandemail.controller;

import com.project.taskandemail.service.AsyncService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class AsyncController {

    @Autowired
    AsyncService service;

    @GetMapping("/hello")
    public String hello(){
        service.hello();
        return "success";
    }
}
