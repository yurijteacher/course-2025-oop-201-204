package ua.com.kneu.groupe_203.example.repository;

import ua.com.kneu.groupe_203.example.config.ConnectionToDB;
import ua.com.kneu.groupe_203.example.dao.ProductDao;
import ua.com.kneu.groupe_203.example.entity.Product;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class ProductRepository extends ConnectionToDB implements ProductDao {

    Connection connection;

    public ProductRepository() {
        this.connection = super.getConnectionToDB();
    }

    @Override
    public void save(Product product) {

        PreparedStatement preparedStatement = null;
        String sql= "INSERT INTO `product` (`name`, `description`, `price`, " +
                "`image`, `category_id`) VALUES (?, ?, ?, ?, ?);";
        try {
            preparedStatement = connection.prepareStatement(sql);
            preparedStatement.setString(1, product.getName());
            preparedStatement.setString(2, product.getDescription());
            preparedStatement.setBigDecimal(3, product.getPrice());
            preparedStatement.setString(4, product.getImage());
            preparedStatement.setLong(5, product.getCategory().getId());

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
    public void update(Product product) {

        String sql ="UPDATE `product` SET `name` = ?, `description` = ?, `price` = ?, `image` = ?, " +
                "`category_id` = ? WHERE `id` = ?;\n";

        PreparedStatement preparedStatement = null;

        try {
            preparedStatement = connection.prepareStatement(sql);
            preparedStatement.setString(1, product.getName());
            preparedStatement.setString(2, product.getDescription());
            preparedStatement.setBigDecimal(3, product.getPrice());
            preparedStatement.setString(4, product.getImage());
            preparedStatement.setLong(5, product.getCategory().getId());
            preparedStatement.setLong(6, product.getId());

            preparedStatement.executeUpdate();

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
    public void delete(Product product) {
        String sql ="DELETE FROM `product` WHERE `id` = ?;\n";

        PreparedStatement preparedStatement = null;

        try {
            preparedStatement = connection.prepareStatement(sql);
            preparedStatement.setLong(1, product.getId());

            preparedStatement.executeUpdate();
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
    public Product findById(Long id) {
        Product product = new Product();

        PreparedStatement preparedStatement = null;
        ResultSet resultSet = null;

        String sql ="SELECT * FROM `product` WHERE `id` = ?;";

        try {
            preparedStatement = connection.prepareStatement(sql);
            preparedStatement.setLong(1, id);

            resultSet = preparedStatement.executeQuery();

            while (resultSet.next()) {

                product.setId(resultSet.getLong("id"));
                product.setName(resultSet.getString("name"));
                product.setDescription(resultSet.getString("description"));
                product.setPrice(resultSet.getBigDecimal("price"));
                product.setImage(resultSet.getString("image"));
                product.setCategory(new CategoryRepository().findById(resultSet.getLong("category_id")));

            }


            resultSet.close();
            preparedStatement.close();


        } catch (SQLException e) {
            e.printStackTrace();
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


        return product;
    }

    @Override
    public List<Product> findAll() {

        List<Product> products = new ArrayList<>();

        PreparedStatement preparedStatement = null;
        ResultSet resultSet = null;

        String sql ="SELECT * FROM `product`";

        try {
            preparedStatement = connection.prepareStatement(sql);
            resultSet = preparedStatement.executeQuery();

            while (resultSet.next()) {
                Product product = new Product();
                product.setId(resultSet.getLong("id"));
                product.setName(resultSet.getString("name"));
                product.setDescription(resultSet.getString("description"));
                product.setPrice(resultSet.getBigDecimal("price"));
                product.setImage(resultSet.getString("image"));
                product.setCategory(new CategoryRepository().findById(resultSet.getLong("category_id")));

                products.add(product);
            }


            resultSet.close();
            preparedStatement.close();


        } catch (SQLException e) {
            e.printStackTrace();
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
