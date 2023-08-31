package com.varios.springBootVarios.mvc.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class HomeController {

    @GetMapping("/")
    public String home(){
        return "redirect:/app/";
       //No cambia la rutas
        //return "forward:/app/";
    }

}
