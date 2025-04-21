package ua.com.kneu.groupe_202.example.repository;

import ua.com.kneu.groupe_202.example.config.ConnectionToDb;
import ua.com.kneu.groupe_202.example.dao.ProductDao;
import ua.com.kneu.groupe_202.example.entity.Products;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class ProductRepository extends ConnectionToDb implements ProductDao {

    private Connection connection;

    public ProductRepository() {
        this.connection = super.getConnection();
    }

    @Override
    public void save(Products products) {

        PreparedStatement preparedStatement = null;

        String sql = "INSERT INTO `product` (`name`, `description`, `price`, `image`, `category_id`) VALUES (?, ?, ?, ?, ?);\n";
        try {
            preparedStatement = connection.prepareStatement(sql);
            preparedStatement.setString(1, products.getName());
            preparedStatement.setString(2, products.getDescription());
            preparedStatement.setBigDecimal(3, products.getPrice());
            preparedStatement.setString(4, products.getImage());
            preparedStatement.setLong(5, products.getCategory().getId());

            preparedStatement.execute();

            preparedStatement.close();
        } catch (SQLException e) {
            throw new RuntimeException(e);
        } finally {
            if (preparedStatement != null) {
                try {
                    preparedStatement.close();
                } catch (SQLException e) {
                    throw new RuntimeException(e);
                }
            }
        }

    }

    @Override
    public void update(Products products) {

    }

    @Override
    public void delete(Products products) {

    }

    @Override
    public Products findById(Long id) {
        return null;
    }

    @Override
    public List<Products> findAll() {


        List<Products> products = new ArrayList<>();

        PreparedStatement preparedStatement = null;
        ResultSet resultSet = null;
        try {
            preparedStatement = connection.prepareStatement("SELECT * FROM `product`");
            resultSet = preparedStatement.executeQuery();

            while (resultSet.next()) {

                Products product = new Products();
                product.setId(resultSet.getLong("id"));
                product.setName(resultSet.getString("name"));
                product.setDescription(resultSet.getString("description"));
                product.setPrice(resultSet.getBigDecimal("price"));
                product.setImage(resultSet.getString("image"));
                product.setCategory(new CategoryRepository().findById(resultSet.getLong("category_id")));

                products.add(product);

            }

        } catch (SQLException e) {
            throw new RuntimeException(e);
        } finally {

            if (resultSet != null) {
                try {
                    resultSet.close();
                } catch (SQLException e) {
                    throw new RuntimeException(e);
                }
            }

            if (preparedStatement != null) {
                try {
                    preparedStatement.close();
                } catch (SQLException e) {
                    throw new RuntimeException(e);
                }
            }
        }


        return products;
    }
}
