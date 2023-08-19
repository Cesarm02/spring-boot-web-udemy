package com.varios.springBootVarios.controllers;

import com.varios.springBootVarios.models.Usuario;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

@Controller
@RequestMapping("/app")
public class IndexController {

    @GetMapping(value = {"/index", "/", "/home"})
    public String index(Model mv){
        mv.addAttribute("titulo", "ola");
        return "index";
    }

    @RequestMapping("/perfil")
    public String perfil(Model model){
        Usuario usuario = new Usuario();
        usuario.setNombre("Cesar");
        usuario.setApellido("Mesa");
        model.addAttribute("titulo", "Perfil " + usuario.getNombre());
        model.addAttribute("usuario", usuario);
        return "perfil";
    }

    @RequestMapping("/listar")
    public String listar(Model model){
        List<Usuario> usuarios = Arrays.asList(new Usuario("Cesar", "Estiven", "correo"),
                new Usuario("Cesar2", "Estiven2", "correo2"));
        model.addAttribute("titulo", "listar");
        return "listar";
    }

    @ModelAttribute("usuarios")
    public List<Usuario> poblarUsuarios(){
        List<Usuario> usuarios = Arrays.asList(new Usuario("Cesar", "Estiven", "correo"),
                new Usuario("Cesar2", "Estiven2", "correo2"));
        return usuarios;
    }

}
