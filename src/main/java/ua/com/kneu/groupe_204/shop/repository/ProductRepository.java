package ua.com.kneu.groupe_204.shop.repository;

import ua.com.kneu.groupe_204.shop.configuration.ConnectionToDB;
import ua.com.kneu.groupe_204.shop.dao.ProductDao;
import ua.com.kneu.groupe_204.shop.entity.Product;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class ProductRepository extends ConnectionToDB implements ProductDao {


    Connection connection;

    public ProductRepository(Connection connection) {
        this.connection = getConnectionToDB();
    }



    @Override
    public void save(Product product) {

        PreparedStatement preparedStatement = null;

        String sql = "INSERT INTO `products` (`name`, `description`, `image`, `price`, `category_id`) VALUES (?, ?, ?, ?, ?);\n";

        try {
            preparedStatement = connection.prepareStatement(sql);

            preparedStatement.setString(1, product.getName());
            preparedStatement.setString(2, product.getDescription());
            preparedStatement.setString(3, product.getImage());
            preparedStatement.setBigDecimal(4, product.getPrice());
            preparedStatement.setLong(5, product.getCategory().getId());

            preparedStatement.execute();

        } catch (SQLException e) {
            throw new RuntimeException(e);
        } finally {
            try {
                preparedStatement.close();
            } catch (SQLException e) {
                throw new RuntimeException(e);
            }
        }
    }

    @Override
    public void update(Product product, Long id) {

    }

    @Override
    public void delete(Product product) {

    }

    @Override
    public Product findById(Long id) {
        return null;
    }

    @Override
    public List<Product> findAll() {

        List<Product> products = new ArrayList<>();


        PreparedStatement preparedStatement = null;
        ResultSet resultSet = null;

        String sql = "SELECT * FROM `products`";


        try {
            preparedStatement = connection.prepareStatement(sql);
            resultSet= preparedStatement.executeQuery();

            while (resultSet.next()) {

                Product product = new Product();
                product.setId(resultSet.getLong("id"));
                product.setName(resultSet.getString("name"));
                product.setDescription(resultSet.getString("description"));
                product.setPrice(resultSet.getBigDecimal("price"));
                product.setCategory(new CategoryRepository(connection).findById(resultSet.getLong("category_id")));

                products.add(product);
            }

        } catch (SQLException e) {
            throw new RuntimeException(e);
        } finally {

            if(resultSet != null) {
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
