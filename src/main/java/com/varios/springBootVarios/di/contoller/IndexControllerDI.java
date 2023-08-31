package com.varios.springBootVarios.di.contoller;

import com.varios.springBootVarios.di.models.service.IServicio;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/di")
public class IndexControllerDI {

    @Qualifier("miServicioComplejo")
    private IServicio miServicio;

    public IndexControllerDI(IServicio miServicio) {
        this.miServicio = miServicio;
    }

    @GetMapping({"/index", "/", ""})
    public String index(Model model){
        model.addAttribute("objeto", miServicio.operacion());
        return "di/index";
    }



}
