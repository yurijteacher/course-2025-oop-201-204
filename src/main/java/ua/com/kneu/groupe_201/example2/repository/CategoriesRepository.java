package ua.com.kneu.groupe_201.example2.repository;

import ua.com.kneu.groupe_201.example2.configuration.ConnectionToDb;
import ua.com.kneu.groupe_201.example2.dao.CategoriesDao;
import ua.com.kneu.groupe_201.example2.entity.Categories;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

public class CategoriesRepository extends ConnectionToDb implements CategoriesDao {

    private Connection connection;

    public CategoriesRepository() {
        this.connection = super.getConnection();
    }

    @Override
    public void save(Categories categories) {

        Statement statement = null;

        String sql = "INSERT INTO `categories` (`name`, `description`, `image`) VALUES ('"
                + categories.getName()+ "', '"
                +categories.getDescription()+"', '"
                +categories.getImage()+"');\n";

        try {
            statement = connection.createStatement();

            statement.execute(sql);
        } catch (SQLException e) {
            throw new RuntimeException(e);
        } finally {
            if (statement != null) {
                try {
                    statement.close();
                } catch (SQLException e) {
                    throw new RuntimeException(e);
                }
            }
        }

    }

    @Override
    public void update(Categories categories) {

    }

    @Override
    public void delete(Categories categories) {

    }

    @Override
    public Categories findById(Long id) {
        return null;
    }

    @Override
    public List<Categories> findAll() {

        List<Categories> categories = new ArrayList<>();

        Statement statement = null;
        String sql = "SELECT * FROM `categories`";
        ResultSet resultSet = null;
        try {
            statement = connection.createStatement();

            resultSet = statement.executeQuery(sql);

            while (resultSet.next()) {
                Categories category = new Categories();
                category.setId(resultSet.getLong("id"));
                category.setName(resultSet.getString("name"));
                category.setDescription(resultSet.getString("description"));
                category.setImage(resultSet.getString("image"));

                categories.add(category);
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


            if (statement != null) {
                try {
                    statement.close();
                } catch (SQLException e) {
                    throw new RuntimeException(e);
                }
            }


        }


        return categories;
    }
}
