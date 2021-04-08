package com.project.dsu.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class MainController {

    //login
    @GetMapping("/login")
    public String  login(Model model){
        model.addAttribute("name", "dsunni");
        return "login";
    }

    //sign
    @GetMapping("/sign")
    public String sign(Model model){
        model.addAttribute("name", "dsunni");
        return "sign";
    }

}
