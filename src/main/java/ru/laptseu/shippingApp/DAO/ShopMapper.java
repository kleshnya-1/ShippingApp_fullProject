package ru.laptseu.shippingApp.DAO;

import org.springframework.jdbc.core.RowMapper;
import ru.laptseu.shippingApp.models.Shop;

import java.sql.ResultSet;
import java.sql.SQLException;

public class ShopMapper implements RowMapper {
    @Override
    public Shop mapRow(ResultSet resultSet, int i) throws SQLException {
        Shop shop = new Shop();
        shop.setAddress(resultSet.getString("address"));
        shop.setName(resultSet.getString("name"));
        shop.setId(resultSet.getInt("id"));
        return shop;
    }
}


