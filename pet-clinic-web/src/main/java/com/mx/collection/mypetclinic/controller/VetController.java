package com.mx.collection.mypetclinic.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@RequestMapping("/vets")
@Controller
public class VetController {

    @RequestMapping({"","/","/index.html","/index"})
    public String index(){
        return "vets/index";
    }
}
