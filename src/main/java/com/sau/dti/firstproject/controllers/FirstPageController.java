package com.sau.dti.firstproject.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class FirstPageController {
    @GetMapping("firstpage")
    //หรือ @GetMapping("/firstpage")
    public String getDtiUser(Model model){
        model.addAttribute("fname", "aaa");
        model.addAttribute("lname", "bbb");
        model.addAttribute("age", 20);

        return "firstpage";
        //หรือ return "firstpage.html";
    }
}
