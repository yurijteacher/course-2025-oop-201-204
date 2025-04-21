package ua.com.kneu.groupe_203.example.repository;

import ua.com.kneu.groupe_203.example.config.ConnectionToDB;
import ua.com.kneu.groupe_203.example.dao.ClientDao;
import ua.com.kneu.groupe_203.example.entity.Clients;

import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class ClientRepository extends ConnectionToDB implements ClientDao {

    private Connection connection;

    public ClientRepository() {
        this.connection = super.getConnectionToDB();
    }


    @Override
    public void save(Clients clients) {

        String sql = "{call saveClient(?, ?, ?, ?)}";
        CallableStatement callableStatement = null;
        try {
            callableStatement = connection.prepareCall(sql);
            callableStatement.setString(1, clients.getFirstName());
            callableStatement.setString(2, clients.getLastName());
            callableStatement.setString(3, clients.getEmail());
            callableStatement.setString(4, clients.getPhone());
            callableStatement.execute();
            callableStatement.close();
        } catch (SQLException e) {
            throw new RuntimeException(e);
        } finally {
            if (callableStatement != null) {
                try {
                    callableStatement.close();
                } catch (SQLException e) {
                    throw new RuntimeException(e);
                }
            }
        }


    }

    @Override
    public void update(Clients clients) {

    }

    @Override
    public void delete(Clients clients) {

    }

    @Override
    public Clients findById(Long id) {
        return null;
    }

    @Override
    public List<Clients> findAll() {

        List<Clients> clients = new ArrayList<>();

        CallableStatement callableStatement = null;

        String sql = "{call findAll()}";

        try {
            callableStatement = connection.prepareCall(sql);
            ResultSet resultSet = callableStatement.executeQuery();

            while (resultSet.next()) {
                Clients client = new Clients();
                client.setId(resultSet.getLong("id"));
                client.setFirstName(resultSet.getString("first_name"));
                client.setLastName(resultSet.getString("last_name"));
                client.setEmail(resultSet.getString("email"));
                client.setPhone(resultSet.getString("phone"));

                clients.add(client);
            }

            callableStatement.close();

        } catch (SQLException e) {
            throw new RuntimeException(e);
        } finally {

            if (callableStatement != null) {
                try {
                    callableStatement.close();
                } catch (SQLException e) {
                    throw new RuntimeException(e);
                }
            }


        }


        return clients;
    }
}
