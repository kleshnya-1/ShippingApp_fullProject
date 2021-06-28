/*
package ru.laptseu.shippingApp.models;*/
package ru.laptseu.shippingApp.models;

import lombok.Data;
import lombok.extern.log4j.Log4j2;


import java.util.ArrayList;

@Data
@Log4j2
public class Order {
    private int id;
    private double price;
    private int clientId;
    private String address;
    private String note;
    private int bagId;

    public Order() {

    }




    /*public Order(String clientId, String address, String note, String[] productsId,
                            int[] quantityInBag) {

        ProductDAO productDAO = new ProductDAO();
        Client client = (Client) clientDAO.get(clientId);
        ArrayList<Product> bag = new ArrayList<>();
        double bagPrice = 0;

        Order order = new Order();

        this.setClient(client); // should i use just clientId?

        if (address != null)
            this.setAddress(address);
        else this.setAddress(client.getAddress());

        if (note != null)
            this.setNote(note);

        if (productsId != null && quantityInBag != null & productsId.length == quantityInBag.length) {

            for (int i = 0; i < productsId.length; i++) {

                Product choosedProduct = (Product) productDAO.get(productsId[i]);
                if (choosedProduct == null) throw new NullPointerException("No product " + productsId[i] + " found");
                if (choosedProduct.getQuantity() <= quantityInBag[i]) {
                    throw new NullPointerException();
                }
                choosedProduct.setQuantity(choosedProduct.getQuantity() - quantityInBag[i]);
                Product productForBag = new Product(choosedProduct);
                productForBag.setQuantity(quantityInBag[i]);
                bagPrice += productForBag.getPrice()*productForBag.getQuantity();
                bag.add(productForBag);
                log.info(productForBag + "added to bug "+ order.getId());
                productDAO.updateDataBase();
            }
        }

        log.info("Totally "+bag.size()+" products in bag with price: "+bagPrice+" crated. ID= " + this.getId());
    }*/

}


