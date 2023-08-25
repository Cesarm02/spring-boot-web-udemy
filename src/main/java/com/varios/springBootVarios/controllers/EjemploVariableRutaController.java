package com.varios.springBootVarios.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/variables")
public class EjemploVariableRutaController {

    @GetMapping("/string/{texto}")
    public String variables(@PathVariable("texto") String textoOther, Model model){
        model.addAttribute("resultado", "Texto: " + textoOther);
        return "variables/ver";
    }

}
