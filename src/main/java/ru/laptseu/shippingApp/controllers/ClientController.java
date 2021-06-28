package ru.laptseu.shippingApp.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import ru.laptseu.shippingApp.DAO.OrderDAO;
import ru.laptseu.shippingApp.models.Order;


@Controller

@RequestMapping("/client")
public class ClientController {

    @Autowired
    OrderDAO orderDAO;


    @GetMapping("/")
    public String getAllCars( ) {
        return "/client/first";
    }

    @GetMapping("/new_order")
    public String getAll(@ModelAttribute("order") Order order) {

        return "/client/new_order";
    }

    @PostMapping()
    public String makeOrder(@ModelAttribute("order")  Order order) {
        orderDAO.add(order);



        return "/client/thankForOrder";
    }

    @GetMapping("/updateAddress")
    public String upAddress() {

        return "/client/upAddress";
    }

}


