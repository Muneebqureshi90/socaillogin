package com.oauth2.auth2.Controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HomeController {
    @GetMapping("/")
    public String home(){
        return "Hello!";
    }

    @GetMapping("/secured")
    public String secured(){
        return "Hello!,Muneeb!!!!";
    }
}
