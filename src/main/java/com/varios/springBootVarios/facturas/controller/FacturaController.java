package com.varios.springBootVarios.facturas.controller;

import com.varios.springBootVarios.facturas.models.domain.Factura;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.ArrayList;

@Controller
@RequestMapping("/factura")
public class FacturaController {

    @Autowired
    private Factura factura;

    @GetMapping("/ver")
    public String ver(Model model){
        model.addAttribute("titulo", "Ejemplo Factura");
        model.addAttribute("factura", factura);
        return "factura/ver";
    }


}
