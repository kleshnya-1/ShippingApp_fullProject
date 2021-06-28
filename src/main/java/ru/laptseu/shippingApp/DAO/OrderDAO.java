
package ru.laptseu.shippingApp.DAO;


import lombok.extern.log4j.Log4j2;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Component;
import ru.laptseu.shippingApp.DAO.interfaces.DataAccessInterface;
import ru.laptseu.shippingApp.DAO.mappers.OrderMapper;
import ru.laptseu.shippingApp.DAO.mappers.ProductMapper;
import ru.laptseu.shippingApp.models.Order;

import java.util.List;

@Log4j2
@Component
public class OrderDAO   implements DataAccessInterface {

    private final JdbcTemplate jdbcTemplate;
    private String database = "orders";

    public OrderDAO(JdbcTemplate jdbcTemplate) {
        this.jdbcTemplate = jdbcTemplate;
    }

    @Override
    public List getAll() {
        return jdbcTemplate.query("select * from "+database+" order by id", new ProductMapper());
    }

    @Override
    public Object get(int id) {
        return  (jdbcTemplate.query("select * from "+database+" where id=?",
                new Object[]{id}, new OrderMapper())).get(0);
    }

    @Override
    public void showAll() {
        System.out.println("\n List of orders:");
        List<Order> p = getAll();
        for (Order s:p){
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
        Order p = (Order) o;

        jdbcTemplate.update("insert into "+database+" (price, client_id, adress, note) values (?,?,?,?)",
                p.getPrice(), p.getClientId(),p.getAddress(),p.getPrice(),p.getNote());

    }

    public void updateProductQuantity(String productId, int quantity){
        jdbcTemplate.update("update "+database+" set quantity =? where id =?",quantity, productId);
    }




}



