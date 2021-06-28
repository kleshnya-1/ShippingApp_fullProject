package ru.laptseu.shippingApp.DAO.mappers;

import org.springframework.jdbc.core.RowCallbackHandler;
import org.springframework.jdbc.core.RowMapper;
import ru.laptseu.shippingApp.models.Order;
import ru.laptseu.shippingApp.models.Shop;

import java.sql.ResultSet;
import java.sql.SQLException;

public class OrderMapper implements RowMapper {
    @Override
    public Order mapRow(ResultSet resultSet, int i) throws SQLException {
        Order order = new Order();
        order.setAddress(resultSet.getString("address"));
        order.setNote(resultSet.getString("note"));
        order.setClientId(resultSet.getInt("client_id"));
        order.setPrice(resultSet.getDouble("price"));
        return order;
    }
}