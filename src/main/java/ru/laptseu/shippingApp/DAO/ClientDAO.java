
package ru.laptseu.shippingApp.DAO;


import lombok.extern.log4j.Log4j2;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Component;
import ru.laptseu.shippingApp.models.Client;
import ru.laptseu.shippingApp.models.Shop;


import java.util.ArrayList;
import java.util.List;
import java.util.NoSuchElementException;

@Log4j2
@Component
public class ClientDAO extends DAO implements DataAccessInterface, AddressUpdatable {


    private final JdbcTemplate jdbcTemplate;
    private String database = "clients";


    public ClientDAO(JdbcTemplate jdbcTemplate) {
        this.jdbcTemplate = jdbcTemplate;
    }


    @Override
    public List<Client> getAll() {

        return jdbcTemplate.query("select * from "+database+" order by id", new ClientMapper());

    }

    @Override
    public Object get(int id) {
        Shop d = (Shop) (jdbcTemplate.query("select * from "+database+" where id=?",
                new Object[]{id}, new ShopMapper())).get(0);
        return  d;


    }



    @Override
    public void showAll() {
        System.out.println("\n List of clients:");
        List<Client> clients = getAll();
        for (Client s:clients){
            System.out.println(s);
        }
    }


    public void add(Object o) {
        Client client = (Client) o;
        jdbcTemplate.update("insert into "+database+" (name, address) values (?,?)", client.getName(), client.getAddress());

        log.info(client + " added");
    }

    @Override
    public void delete(String id) {

        jdbcTemplate.update("delete * from "+database+" where id=?", id);
        //log.info("Shop id "+id+" deleted");
    }



    @Override
    public void reset() {
        jdbcTemplate.update("drop "+database);
    }


    @Override
    public void updateAddress(String id, String address) {
        jdbcTemplate.update("update * from "+database+" (address) values  (?) where id=?", address, id);
    }
}

