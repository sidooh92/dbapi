package com.security.dbapi.controller;


import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


@RequestMapping("/rest")
@RestController
public class HelloController {

    @GetMapping("/all")
    public String helloOne() {
        return "Hello One";
    }

    @GetMapping("/security/all")
    public String helloSecure() {
        return "Hello Secure";
    }




}
