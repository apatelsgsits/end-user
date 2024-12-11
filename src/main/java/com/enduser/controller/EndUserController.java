package com.enduser.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class EndUserController {

    @GetMapping()
    private String getMessage(){
        return "EndUser-Service";
    }

}
