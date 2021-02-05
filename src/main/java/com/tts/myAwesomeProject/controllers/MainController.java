package com.tts.myAwesomeProject.controllers;

import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RequestMapping;


@RestController
public class MainController {

    @RequestMapping("/")
    public String home() {
        return "Hello World!";
    }

}


