package com.spring.liquidation.infraestructure.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/worker")
public class Controller {

    @GetMapping("/saludo")
    public String saludar(){
        return "Holaa worker";
    }


}
