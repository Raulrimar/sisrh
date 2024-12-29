package com.registros.sisrh.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

import com.registros.sisrh.model.Servidor;
import com.registros.sisrh.service.ServidorService;

import org.springframework.ui.Model;

@Controller
public class ServidorController {
    @Autowired
    private ServidorService servidorSevice;
    //criar metodos para responder solicitação que virão das paginas html
    @GetMapping("/")
    public String listarServidores(){
        return "/index";
    }
    @GetMapping("/novo")
    public String novoServidor(Model model){
        Servidor servidor = new Servidor();
        model.addAttribute("novoServidor", servidor);
        return "/cadastroServidor";
    }

    @PostMapping("/salvar")
    public String salvarServidor(@ModelAttribute("novoServidor") Servidor servidor){
       servidorSevice.criaServidor(servidor);
        return "redirect:/novo";
    }
}
