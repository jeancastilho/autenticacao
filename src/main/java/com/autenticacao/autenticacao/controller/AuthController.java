package com.autenticacao.autenticacao.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.autenticacao.autenticacao.repository.AuthenticationManager;

@Controller
public class AuthController {

private AuthenticationManager authManager;
    
    public AuthController(AuthenticationManager authManager) {
        this.authManager = authManager;
    }
    
    @GetMapping("/login")
    public String authenticateUser(@RequestParam("username") String email, @RequestParam("password") String senha) {
        boolean isAuthenticated = authManager.login(email, senha);
        
        if (isAuthenticated) {
            return "success"; 
        } else {
            return "error"; 
        }
    }
}
