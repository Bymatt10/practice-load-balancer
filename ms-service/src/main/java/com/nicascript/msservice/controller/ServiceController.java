package com.nicascript.msservice.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("api/v1/service")
public class ServiceController {

    @GetMapping("/")
    public String getService() {
        return this.getClass().getSimpleName();
    }
}
