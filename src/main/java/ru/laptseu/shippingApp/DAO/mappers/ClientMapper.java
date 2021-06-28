package ru.laptseu.shippingApp.DAO.mappers;

import org.springframework.jdbc.core.RowCallbackHandler;
import org.springframework.jdbc.core.RowMapper;
import ru.laptseu.shippingApp.models.Client;
import ru.laptseu.shippingApp.models.Shop;

import java.sql.ResultSet;
import java.sql.SQLException;

public class ClientMapper implements RowMapper {
    @Override
    public Client mapRow(ResultSet resultSet, int i) throws SQLException {
        Client client = new Client();
        client.setAddress(resultSet.getString("address"));
        client.setName(resultSet.getString("name"));
        client.setId(resultSet.getInt("id"));
        return client;
    }
}