package com.project.app.masterspringboot.controllers;

import com.project.app.masterspringboot.models.Usuario;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.ArrayList;
import java.util.List;

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
        usuario.setEmail("luke@gmail.com");

        model.addAttribute("usuario", usuario);
        model.addAttribute("titulo", "Perfil del usuario: ".concat(usuario.getNombre()));
        return "perfil";
    }

    @GetMapping("/listar")
    public String listar(Model model){

        List<Usuario> usuarios = new ArrayList<>();

        model.addAttribute("titulo", "Listado de Usuarios ");
        model.addAttribute("usuarios", usuarios);


        return "listar";
    }

}
