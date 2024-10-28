package com.erp.security_service.controller;

import jakarta.servlet.http.HttpServletRequest;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class UserController {
    @GetMapping("/")
    public String welcomePage(HttpServletRequest request){
        return "Welcome to home page\n"+request.getSession().getId();
    }
}
