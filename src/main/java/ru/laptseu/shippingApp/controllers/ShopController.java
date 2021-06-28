package ru.laptseu.shippingApp.controllers;


import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
@RequestMapping("/shop")
public class ShopController {

    @GetMapping("/")
    public String main(){
        return "shop/first";
    }

    @GetMapping("/update")
    public String update(){
        return "shop/update";
    }
}
