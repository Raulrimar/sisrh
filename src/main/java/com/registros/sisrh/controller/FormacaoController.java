package com.registros.sisrh.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

import com.registros.sisrh.model.Formacao;
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

    @PostMapping("/salvarFormacao")
    public String salvarFormacao(@ModelAttribute("novoformacao") Formacao formacao) { formacaoService.criaFormacao(formacao);
        return "redirect:/";
    }
    
}
