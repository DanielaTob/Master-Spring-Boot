package com.project.app.masterspringboot.controllers;

import com.project.app.masterspringboot.models.Usuario;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

//Mostrar peticiones del usuario
@Controller
@RequestMapping("/app")
public class IndexController {

    @GetMapping(value = "/index")
    public String index(Model model){
        model.addAttribute("titulo", "Hola Spring Framework");
        return "index";
    }

    @GetMapping(value = "/perfil")
    public String perfil(Model model){

        Usuario usuario = new Usuario();

        usuario.setNombre("Luke");
        usuario.setApellido("SkyWalker");

        model.addAttribute("usuario", usuario);
        model.addAttribute("titulo", "Perfil del usuario: ".concat(usuario.getNombre()));
        return "perfil";
    }

}
