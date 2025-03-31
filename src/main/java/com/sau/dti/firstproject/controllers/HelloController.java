package com.sau.dti.firstproject.controllers;

import com.sau.dti.firstproject.models.DtiUser;
import com.sau.dti.firstproject.response.ResponseHandler;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
public class HelloController {
    //Request
    @GetMapping("/hi")
    public String showHi(@RequestParam(required = false) String firstname,@RequestParam String lastname) {
        System.out.println(firstname);
        System.out.println(lastname);
        if(firstname == null){
            return "Hi..." + lastname;
        }else{
            return "Hi..." + firstname + " " + lastname;
        }
    }

    @RequestMapping(value = "/hoo", method = RequestMethod.GET)
    public String showHoo(@RequestParam(required = false) String firstname,@RequestParam String lastname) {
        System.out.println(firstname);
        System.out.println(lastname);
        if(firstname == null){
            return "Hoo..." + lastname;
        }else{
            return "Hoo..." + firstname + " " + lastname;
        }
    }

    @RequestMapping(value = "/hui/{firstname}/{lastname}", method = RequestMethod.GET)
    public String showHui(@PathVariable String firstname,@PathVariable String lastname) {
        System.out.println(firstname);
        System.out.println(lastname);
        if(firstname == null){
            return "Hui..." + lastname;
        }else{
            return "Hui..." + firstname + " " + lastname;
        }
    }

    @PostMapping("/hey")
    public String showHey(@RequestParam(required = false) String firstname,@RequestParam String lastname) {
        System.out.println(firstname);
        System.out.println(lastname);
        if(firstname == null){
            return "Hey..." + lastname;
        }else{
            return "Hey..." + firstname + " " + lastname;
        }
    }

    @RequestMapping(value = "/hur", method = RequestMethod.POST)
    public String showHur(@ModelAttribute DtiUser dtiUser) {
        System.out.println(dtiUser.getFirstName());
        System.out.println(dtiUser.getLastName());
        if(dtiUser.getFirstName() == null){
            return "Hur..." + dtiUser.getLastName();
        }else{
            return "Hur.." + dtiUser.getFirstName() + " " + dtiUser.getLastName();
        }
    }

    @RequestMapping(value = "/hum", method = RequestMethod.POST)
    public String showHum(@RequestBody DtiUser dtiUser) {
        System.out.println(dtiUser.getFirstName());
        System.out.println(dtiUser.getLastName());
        if(dtiUser.getFirstName() == null){
            return "Hum..." + dtiUser.getLastName();
        }else{
            return "Hum.." + dtiUser.getFirstName() + " " + dtiUser.getLastName();
        }
    }

    //Response
    @RequestMapping(value = "/dtiuser", method = RequestMethod.GET)
    public DtiUser getDtiUser(){
        DtiUser dtiUser = new DtiUser();
        dtiUser.setFirstName("wow");
        dtiUser.setLastName("woo");
        dtiUser.setAge(20);
        return dtiUser;
    }

    @RequestMapping(value = "/dtiuserok/test", method = RequestMethod.GET)
    public ResponseEntity<DtiUser> getDtiUserOk(){
        DtiUser dtiUser = new DtiUser();
        dtiUser.setFirstName("wow");
        dtiUser.setLastName("woo");
        dtiUser.setAge(20);
        return ResponseEntity.status(201).body(dtiUser);
    }

    @RequestMapping(value = "/dtiusercustom", method = RequestMethod.GET)
    public ResponseEntity<Object> getDtiUserCustom(){
        DtiUser dtiUser = new DtiUser();
        dtiUser.setFirstName("wow");
        dtiUser.setLastName("woo");
        dtiUser.setAge(20);
        return ResponseHandler.generateResponse("ok", HttpStatus.OK, dtiUser);
    }
}
