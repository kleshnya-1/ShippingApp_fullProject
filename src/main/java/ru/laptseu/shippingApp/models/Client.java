package ru.laptseu.shippingApp.models;

import lombok.Data;
import lombok.extern.log4j.Log4j2;

import java.io.Serializable;

@Data

@Log4j2
public class Client  implements Serializable {
    private int id;
    private String name;
    private String address;



    public Client(String name, String address) {

        this.name= name;
        this.address= address;
        log.info("Client "+name+" created with id "+ id);
    }
    public Client(){

    };




}
