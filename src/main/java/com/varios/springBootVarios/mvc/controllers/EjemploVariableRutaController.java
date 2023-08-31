package com.varios.springBootVarios.mvc.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/variables")
public class EjemploVariableRutaController {

    @GetMapping("/")
    public String index(Model model){
        return "variables/index";
    }

    @GetMapping("/string/{texto}")
    public String variables(@PathVariable("texto") String textoOther, Model model){
        model.addAttribute("resultado", "Texto: " + textoOther);
        return "variables/ver";
    }

    @GetMapping("/string/{texto}/{texto2}")
    public String variables(@PathVariable("texto") String textoOther,@PathVariable("texto2") int number, Model model){
        model.addAttribute("resultado", "Texto: " + textoOther + " number: " + number);
        return "variables/ver";
    }
}
