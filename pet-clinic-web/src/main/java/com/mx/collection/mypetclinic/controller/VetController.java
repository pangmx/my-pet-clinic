package com.mx.collection.mypetclinic.controller;

import com.mx.collection.mypetclinic.service.VetService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@RequestMapping("/vets")
@Controller
public class VetController {

    private final VetService vetService;

    public VetController(VetService vetService) {
        this.vetService = vetService;
    }

    @RequestMapping({"","/","/index.html","/index"})
    public String listVets(Model model){
        model.addAttribute("vets", vetService.findAll());

        return "vets/index";
    }
}
