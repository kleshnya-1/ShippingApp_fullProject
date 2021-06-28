package ru.laptseu.shippingApp.models;

import lombok.Data;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

@Data
public class Product   implements Serializable  {
    private int id;
    private int shopId;
    private String name;
    private int quantity;
    private double price;
    private int[] categories;


  /*  public Product(String name, int quantity, double price, String shopId, Categories ... categories) {


        this.shopId = shopId;
        this.name = name;
        this.quantity = quantity;
        this.price = price;

        for (int i = 0; i<categories.length; i++){
            this.categories.add(categories[i]);
        }

    }*/
   /* public Product(Product choosedProduct){

        this.id = choosedProduct.getId();
        this.shopId = choosedProduct.getShopId();
        this.name = choosedProduct.getName();
        this.quantity = choosedProduct.quantity;
        this.price = choosedProduct.getPrice();
        this.categories = choosedProduct.getCategories();


    };*/

    public Product( ){

    };




}
