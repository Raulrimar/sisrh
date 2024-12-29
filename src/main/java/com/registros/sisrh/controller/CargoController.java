package com.registros.sisrh.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

import com.registros.sisrh.model.Cargo;
import com.registros.sisrh.service.CargoService;

@Controller
public class CargoController {
    @Autowired
    public CargoService cargoService;

    @GetMapping("/novoCargo")
    public String novoCargo(Model model){
        Cargo cargo = new Cargo();
        model.addAttribute("novoCargo", cargo);
        return "/cadastroCargo";
    }
    @PostMapping("/salvarCargo")
    public String salvarCargo(@ModelAttribute("novoCargo")Cargo cargo) { cargoService.criaCargo(cargo);
        return "redirect:/";
}
}
