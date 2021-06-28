package ru.laptseu.shippingApp.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import ru.laptseu.shippingApp.DAO.ClientDAO;
import ru.laptseu.shippingApp.DAO.ProductDAO;
import ru.laptseu.shippingApp.DAO.ShopDAO;

@Controller
@RequestMapping("/admin")
public class AdminController {

    @Autowired
    private final ShopDAO shopDAO;
    private final ProductDAO productDAO;
    private final ClientDAO clientDAO;

    public AdminController(ShopDAO shopDAO, ProductDAO productDAO, ClientDAO clientDAO) {
        this.shopDAO = shopDAO;
        this.productDAO = productDAO;
        this.clientDAO = clientDAO;
    }
    //private final OrderDAO shopDAO;


    @GetMapping("/")
    public String getAllCars( ) {
                return "/admin/first";
    }

    @GetMapping("/showShops")
    public String getAllCars(Model model) {
        model.addAttribute("shops", shopDAO.getAll());
        return "/admin/showAllShops";
    }
    @GetMapping("/showProducts")
    public String getAllProducts(Model model) {
        model.addAttribute("products", productDAO.getAll());
        return "/admin/showAllProducts";
    }
    @GetMapping("/showClients")
    public String getAllClients(Model model) {
        model.addAttribute("clients", clientDAO.getAll());
        return "/admin/showAllClients";
    }
}


