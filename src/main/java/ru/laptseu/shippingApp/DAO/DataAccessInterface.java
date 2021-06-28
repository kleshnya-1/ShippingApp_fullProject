package ru.laptseu.shippingApp.DAO;

import java.util.List;

public interface DataAccessInterface {


    public void add(Object o) ;
    public List getAll();
    public Object get(int id);
    public void showAll();
    public void delete(String id);
   // public void updateDataBase();
    public void reset();



}
