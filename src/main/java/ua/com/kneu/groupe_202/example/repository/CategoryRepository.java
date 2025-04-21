package ua.com.kneu.groupe_202.example.repository;

import ua.com.kneu.groupe_202.example.config.ConnectionToDb;
import ua.com.kneu.groupe_202.example.dao.CategoryDao;
import ua.com.kneu.groupe_202.example.entity.Category;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class CategoryRepository extends ConnectionToDb implements CategoryDao {

    private Connection connection;

    public CategoryRepository() {
        this.connection = super.getConnection();
    }

    @Override
    public void save(Category category) {
        Statement statement = null;

        try {
            statement = connection.createStatement();
            String sql = "INSERT INTO `category` (`name`, `description`, `image`) VALUES ('"
                    +category.getName()+"', '"
                    +category.getDescription()+"', '"
                    +category.getImage()+"');\n";
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
    public void update(Category category) {
        Statement statement = null;

        try {
            statement = connection.createStatement();
            String sql = "UPDATE `category` SET `name` = '"+category.getName()+"', `description` = '"
                    +category.getDescription()+"', `image` = '"
                    +category.getImage()+"' WHERE (`id` = "+category.getId()+");\n";
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

        try {
            statement = connection.createStatement();
            String sql = "DELETE FROM `category` WHERE (`id` = "+category.getId()+");\n";
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
            resultSet = statement.executeQuery("SELECT * FROM `category` where `id` = " + id);

            while (resultSet.next()) {
                category.setId(resultSet.getLong("id"));
                category.setName(resultSet.getString("name"));
                category.setDescription(resultSet.getString("description"));
                category.setImage(resultSet.getString("image"));
            }

            resultSet.close();
            statement.close();

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
          e.printStackTrace();
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
