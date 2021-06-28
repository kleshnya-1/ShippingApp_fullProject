package ru.laptseu.shippingApp.models;

import lombok.Data;
import lombok.extern.log4j.Log4j2;

import java.io.Serializable;

@Data
@Log4j2
public class Shop implements Serializable {
    private int id;
    private String name;
    private String address;

    public Shop(String name, String address) {

        this.name = name;
        this.address = address;
        log.info("Shop "+name+" created with id "+ id);
    }
    public Shop() {

    }
}
