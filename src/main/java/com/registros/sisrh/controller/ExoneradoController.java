package com.registros.sisrh.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

import com.registros.sisrh.model.Exonerado;
import com.registros.sisrh.service.ExoneradoService;

@Controller
public class ExoneradoController {

    @Autowired
    private ExoneradoService exoneradoService;

    @GetMapping("/novoExonerado")
    public String novoExonerado(Model model) {
        Exonerado exonerado = new Exonerado();
        model.addAttribute("novoExonerado", exonerado);
        return "cadastroExonerado"; // Corrigido: sem barra inicial
    }

    @PostMapping("/salvarExonerado")
    public String salvarExonerado(@ModelAttribute("novoExonerado") Exonerado exonerado) {
        exoneradoService.criaExonerado(exonerado);
        return "redirect:/"; // Certifique-se de que esta seja a rota desejada
    }
}
