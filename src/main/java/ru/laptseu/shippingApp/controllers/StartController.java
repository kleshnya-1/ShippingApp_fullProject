package ru.laptseu.shippingApp.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;


@Controller
public class StartController {

    @GetMapping("/")
    public String first(){
        return "/first";
    }

}

