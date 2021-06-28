package ru.laptseu.shippingApp.DAO;

import org.springframework.jdbc.core.RowCallbackHandler;
import org.springframework.jdbc.core.RowMapper;
import ru.laptseu.shippingApp.models.Product;
import ru.laptseu.shippingApp.models.Shop;

import java.sql.Array;
import java.sql.ResultSet;
import java.sql.SQLException;

public class ProductMapper implements RowMapper {

    @Override
    public Product mapRow(ResultSet resultSet, int i) throws SQLException {
        Product product = new Product();
        product.setQuantity(resultSet.getInt("quantity"));
        product.setName(resultSet.getString("name"));
        product.setId(resultSet.getInt("id"));
        product.setPrice(resultSet.getInt("id"));
        product.setShopId(resultSet.getInt("shop_id"));


        return product;
    }
}
