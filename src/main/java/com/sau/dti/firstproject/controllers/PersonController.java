package com.sau.dti.firstproject.controllers;

import com.sau.dti.firstproject.models.Person;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.time.Year;

@Controller
public class PersonController {

    //@GetMapping("/person")
    @RequestMapping(value = "/person", method = RequestMethod.GET)
    public String inputPersonPage(Model model){
        model.addAttribute("person",new Person());
        return "person";
    }

    //@PostMapping("/showperson")
    @RequestMapping(value = "/showperson", method = RequestMethod.POST)
    public String showPersonPage(@ModelAttribute Person person, Model model){
        model.addAttribute("person", person);
        int age = Year.now().getValue() - person.getBirthYear();
        model.addAttribute("age", age);
        return "showperson";
    }
}
