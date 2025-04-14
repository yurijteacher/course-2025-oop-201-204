package ua.com.kneu.groupe_203.example.config;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class ConnectionToDB {

    public Connection getConnectionToDB() {

        Connection connection = null;

        String url = "jdbc:mysql://localhost:3306/shop_203_2025";
        String pass = "root1234";
        String user = "root";

        try {
            connection = DriverManager.getConnection(url, user, pass);
            System.out.println("Connection to DB successful!!!");
        } catch (SQLException e) {
            e.printStackTrace();
            System.out.println("Connection to DB failed!!!");
        }

        return connection;
    }


}
