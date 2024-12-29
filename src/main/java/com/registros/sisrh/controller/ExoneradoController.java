package com.registros.sisrh.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

import com.registros.sisrh.model.Exonerado;
import com.registros.sisrh.service.ExoneradoService;
import org.springframework.ui.Model;

@Controller
public class ExoneradoController {
    @Autowired
    public ExoneradoService exoneradoService;

    @GetMapping("/novoExonerado")
    public String novoExonerado(Model model){
        Exonerado exonerado = new Exonerado();
        model.addAttribute("novoExonerado", exonerado);
        return "/cadastroExonerado";
    }

}
