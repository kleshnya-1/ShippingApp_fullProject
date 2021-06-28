package ru.laptseu.shippingApp.utilites;/*
package ru.laptseu.shippingApp.utilites;

import com.google.gson.Gson;
import lombok.extern.log4j.Log4j2;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.util.ArrayList;

@Log4j2
public class Writer {




   */
/* public void writeObject(String filePath, Object object) {

        FileOutputStream fos = null;
        try {
            fos = new FileOutputStream(filePath);
            ObjectOutputStream oos = new ObjectOutputStream(fos);

            oos.writeObject(gson.toJson(object));
            log.info(object + " added to " + filePath);
            oos.close();
        } catch (FileNotFoundException e) {
            log.error("JSON file in " + filePath + " not found");
        } catch (IOException e) {
            log.error(e);

        }


    }*//*

   public void writeList(String filePath, ArrayList list) {

       FileOutputStream fos = null;
       try {
           fos = new FileOutputStream(filePath);
           ObjectOutputStream oos = new ObjectOutputStream(fos);

           oos.writeObject(gson.toJson(list));
           log.info(list + " added to " + filePath);
           oos.close();
       } catch (FileNotFoundException e) {
           log.error("JSON file in " + filePath + " not found");
       } catch (IOException e) {
           log.error(e);

       }


   }

    public void updateList(String filePath, ArrayList list) {

        FileOutputStream fos = null;
        try {
            fos = new FileOutputStream(filePath);
            ObjectOutputStream oos = new ObjectOutputStream(fos);

            oos.reset();


            oos.writeObject(gson.toJson(list));
            log.info(list + " added to " + filePath);
            oos.close();
        } catch (FileNotFoundException e) {
            log.error("JSON file in " + filePath + " not found");
        } catch (IOException e) {
            log.error(e);

        }


    }

    public void resetList(String filePath){
        FileOutputStream fos = null;
        try {
            fos = new FileOutputStream(filePath);
            ObjectOutputStream oos = new ObjectOutputStream(fos);
            oos.reset();
                        oos.close();
        } catch (FileNotFoundException e) {
            log.error("JSON file in " + filePath + " not found");
        } catch (IOException e) {
            log.error(e);

        }
    }


}
*/
