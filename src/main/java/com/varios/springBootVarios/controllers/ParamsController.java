package com.varios.springBootVarios.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import javax.servlet.http.HttpServletRequest;

@Controller
@RequestMapping("/params")
public class ParamsController {

    @GetMapping("/")
    public String index(){
        return "params/index";
    }

    @GetMapping("/string")
    public String param(@RequestParam(name = "texto",required = false, defaultValue = "Default") String texto,  Model model){
        model.addAttribute("resultado", "Texto enviado " + texto);
        return "params/ver";
    }

    @GetMapping("/mix-params")
    public String param(@RequestParam String saludo,@RequestParam int numero,  Model model){
        model.addAttribute("resultado", "Texto enviado " + saludo + "'y el numero es '" + numero);
        return "params/ver";
    }

    @GetMapping("/mix-params-request")
    public String param(HttpServletRequest request, Model model){
        String saludo = request.getParameter("saludo");
        int numero;
        try{
            numero = Integer.parseInt(request.getParameter("numero"));
        }catch (NumberFormatException e){
            numero = 0;
        }
        model.addAttribute("resultado", "Texto enviado " + saludo + "'y el numero es '" + numero);
        return "params/ver";
    }
}
