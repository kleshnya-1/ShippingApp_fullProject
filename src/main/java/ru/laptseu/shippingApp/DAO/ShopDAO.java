package ru.laptseu.shippingApp.DAO;

import lombok.extern.log4j.Log4j2;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Component;
import ru.laptseu.shippingApp.models.Shop;

import java.util.List;

@Component
//@Log4j2
public class ShopDAO extends DAO implements DataAccessInterface, AddressUpdatable {

    private final JdbcTemplate jdbcTemplate;
       private String database = "shops";


    public ShopDAO(JdbcTemplate jdbcTemplate) {
this.jdbcTemplate = jdbcTemplate;
    }


    @Override
    public List<Shop> getAll() {
        return jdbcTemplate.query("select * from "+database+" order by id", new ShopMapper());
    }

    @Override
    public Object get(int id) {
        Shop d = (Shop) (jdbcTemplate.query("select * from shops where id=?",
                new Object[]{id}, new ShopMapper())).get(0);
        return  d;
    }

    @Override
    public void showAll() {
        System.out.println("\n List of shops:");
        List<Shop> shops = getAll();
        for (Shop s:shops){
            System.out.println(s);
        }

    }

    @Override
    public void delete(String id) {
        jdbcTemplate.update("delete * from shops where id=?", id);
        //log.info("Shop id "+id+" deleted");
    }



    public void add(Object o) {
        Shop shop = (Shop)o;
       jdbcTemplate.update("insert into "+database+" (name, address) values (?,?)", shop.getName(), shop.getAddress());

    }

    @Override
    public void updateAddress(String id, String address) {
       jdbcTemplate.update("update * from "+database+" (address) values  (?) where id=?", address, id);

    }

    @Override
    public void reset() {
        jdbcTemplate.update("drop "+database);
    }
}
