package ua.com.kneu.groupe_204.shop.repository;

import ua.com.kneu.groupe_204.shop.configuration.ConnectionToDB;
import ua.com.kneu.groupe_204.shop.dao.CategoryDao;
import ua.com.kneu.groupe_204.shop.entity.Category;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

public class CategoryRepository extends ConnectionToDB implements CategoryDao {

    private Connection connection;

    public CategoryRepository(Connection connection) {
        this.connection = getConnectionToDB();
    }


    @Override
    public void save(Category category) {

        Statement statement = null;

        String sql = "INSERT INTO `category` (`name`, `description`, `image`) VALUES ('" + category.getName() +
                "', '" + category.getDescription() + "', '"
                + category.getUrlImage() + "');\n";

        try {
            statement = connection.createStatement();
            statement.execute(sql);

        } catch (SQLException e) {
            throw new RuntimeException(e);
        } finally {
            try {
                statement.close();
            } catch (SQLException e) {
                throw new RuntimeException(e);
            }
        }

    }

    @Override
    public void update(Category category, Long id) {

        Statement statement = null;

        String sql = "UPDATE `category` SET `name` = '"+category.getName()+"', `description` = '"+category.getDescription()+"', `image` = '"+category.getUrlImage()+"' WHERE (`id` = '"+category.getId()+"');\n";

        try {
            statement = connection.createStatement();
            statement.executeUpdate(sql);

        } catch (SQLException e) {
            throw new RuntimeException(e);
        } finally {
            try {
                statement.close();
            } catch (SQLException e) {
                throw new RuntimeException(e);
            }
        }
    }

    @Override
    public void delete(Category category) {

        Statement statement = null;

        String sql = "DELETE FROM `category` WHERE `id` = '" + category.getId() + "';";

        try {
            statement = connection.createStatement();
            statement.executeUpdate(sql);

        } catch (SQLException e) {
            throw new RuntimeException(e);
        } finally {
            try {
                statement.close();
            } catch (SQLException e) {
                throw new RuntimeException(e);
            }
        }


    }

    @Override
    public Category findById(Long id) {

        Category category = new Category();


        String sql = "SELECT * FROM `category` where `id` = '" + id + "';";

        Statement statement = null;
        ResultSet resultSet = null;

        try {
            statement = connection.createStatement();
            resultSet = statement.executeQuery(sql);

            while (resultSet.next()) {

                category.setId(resultSet.getLong("id"));
                category.setName(resultSet.getString("name"));
                category.setDescription(resultSet.getString("description"));
                category.setUrlImage(resultSet.getString("image"));
            }

        } catch (SQLException e) {
            throw new RuntimeException(e);
        } finally
        {
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

        return category;
    }

    @Override
    public List<Category> findAll() {

        List<Category> categories = new ArrayList<>();
        String sql = "SELECT * FROM `category`";

        Statement statement = null;
        ResultSet resultSet = null;

        try {
            statement = connection.createStatement();
            resultSet = statement.executeQuery(sql);

            while (resultSet.next()) {
                Category category = new Category();

                category.setId(resultSet.getLong("id"));
                category.setName(resultSet.getString("name"));
                category.setDescription(resultSet.getString("description"));
                category.setUrlImage(resultSet.getString("image"));

                categories.add(category);
            }

    //            resultSet.close();
    //            statement.close();

        } catch (SQLException e) {
            throw new RuntimeException(e);
        } finally
        {
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
