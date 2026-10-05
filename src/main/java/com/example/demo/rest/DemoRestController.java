/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.example.demo.rest;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController

public class DemoRestController {
    @GetMapping("/")
    public String holaMundo(){
        return "Hola mundo!";
    }
    @GetMapping("/api")
    public String holaMundoApi(){
        return "Hola "+this.nombre+"!";
    }
    
    @Value("${nombre}")
    private String nombre;
    
}
