package com.allyServer.controller;

import org.springframework.web.bind.annotation.*;

@RestController
public class UserController {

    @GetMapping("/users")
    public String crearUsuario() {
        return "Prueba";
    }
}
