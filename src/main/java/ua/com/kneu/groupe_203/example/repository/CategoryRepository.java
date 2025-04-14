package ua.com.kneu.groupe_203.example.repository;

import ua.com.kneu.groupe_203.example.config.ConnectionToDB;
import ua.com.kneu.groupe_203.example.dao.CategoryDao;
import ua.com.kneu.groupe_203.example.entity.Category;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

public class CategoryRepository extends ConnectionToDB implements CategoryDao {

    private Connection connection;

    public CategoryRepository() {
            this.connection = super.getConnectionToDB();
    }

    @Override
    public void save(Category category) {

        Statement statement = null;

        String sql = "INSERT INTO `category` (`name`, `description`, `image`) VALUES ('"
                +category.getName()+"', '"
                +category.getDescription()+"', '"
                +category.getImage()+"');\n";

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


        // Statement
        // PreparedStatement
        // CallableStatement
    }

    @Override
    public void update(Category category) {
        Statement statement = null;

        String sql = "UPDATE `category` SET `name` = '"+category.getName()+"', `description` = '"+category.getDescription()+"', `image` = '"+category.getImage()+"' WHERE `id` = "+category.getId()+";\n";

        try {
            statement = connection.createStatement();
            statement.executeUpdate(sql);

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
    public void delete(Category category) {
        Statement statement = null;

        String sql = "DELETE from `category` WHERE `id` = "+category.getId()+";\n";

        try {
            statement = connection.createStatement();
            statement.executeUpdate(sql);

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
    public Category findById(Long id) {
        Category category = new Category();

        Statement statement = null;
        ResultSet resultSet = null;
        try {
            statement = connection.createStatement();
            resultSet = statement.executeQuery("SELECT * FROM `category` where `id`='"+id+"';\n");

            while (resultSet.next()) {
                category.setId(resultSet.getLong("id"));
                category.setName(resultSet.getString("name"));
                category.setDescription(resultSet.getString("description"));
                category.setImage(resultSet.getString("image"));
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
        return category;
    }

    @Override
    public List<Category> findAll() {

        List<Category> categories = new ArrayList<>();

        Statement statement = null;
        ResultSet resultSet = null;
        try {
            statement = connection.createStatement();
            resultSet = statement.executeQuery("SELECT * FROM `category`");

            while (resultSet.next()) {
                Category category = new Category();
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
