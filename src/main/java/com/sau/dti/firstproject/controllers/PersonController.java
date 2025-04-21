package com.sau.dti.firstproject.controllers;

import com.sau.dti.firstproject.models.Person;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

import java.time.Year;

@Controller
public class PersonController {

    @GetMapping("/person")
    public String inputPersonPage(Model model){
        model.addAttribute("person",new Person());
        return "person";
    }

    @PostMapping("/showperson")
    public String showPersonPage(@ModelAttribute Person person, Model model){
        model.addAttribute("person", person);
        int age = Year.now().getValue() - person.getBirthYear();
        model.addAttribute("age", age);
        return "showperson";
    }
}
