/*
package ru.laptseu.shippingApp.DAO;*/
package ru.laptseu.shippingApp.DAO;

import lombok.extern.log4j.Log4j2;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Component;
import ru.laptseu.shippingApp.models.Categories;
import ru.laptseu.shippingApp.models.Product;
import ru.laptseu.shippingApp.models.Shop;

import java.util.ArrayList;
import java.util.List;
import java.util.NoSuchElementException;

@Log4j2
@Component
public class ProductDAO extends  DAO implements DataAccessInterface {

    private final JdbcTemplate jdbcTemplate;
    private String database = "products";

    public ProductDAO(JdbcTemplate jdbcTemplate) {
        this.jdbcTemplate = jdbcTemplate;
    }


    @Override
    public List getAll() {
        return jdbcTemplate.query("select * from "+database+" order by id", new ProductMapper());
    }

    @Override
    public Object get(int id) {
        return  (jdbcTemplate.query("select * from "+database+" where id=?",
                new Object[]{id}, new ShopMapper())).get(0);
    }

    @Override
    public void showAll() {
        System.out.println("\n List of products:");
        List<Shop> shops = getAll();
        for (Shop s:shops){
            System.out.println(s);
        }
    }

    @Override
    public void delete(String id) {
        jdbcTemplate.update("delete * from "+database+" where id=?", id);
    }


    @Override
    public void reset() {
        jdbcTemplate.update("drop "+database);
    }


    public void add(Object o)  {
        Product p = (Product)o;

        jdbcTemplate.update("insert into "+database+" (shop_id, name, quantity, price, categories) values (?,?,?,?,?)",
                p.getShopId(), p.getName(),p.getQuantity(),p.getPrice(),p.getCategories());

    }

    public void updateProductQuantity(String productId, int quantity){
        jdbcTemplate.update("update "+database+" set quantity =? where id =?",quantity, productId);
    }



}


