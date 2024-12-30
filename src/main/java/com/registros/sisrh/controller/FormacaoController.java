package com.registros.sisrh.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import com.registros.sisrh.service.FormacaoService;

@Controller
public class FormacaoController {
    @Autowired
    public FormacaoService formacaoService;

    @GetMapping("/novoformacao")
    public String novoFormacao(Model model) {
        Formacao formacao = new Formacao();
        model.addAttribute("novoformacao", formacao);
        return "/cadastroFormacao";
    }
    
}
