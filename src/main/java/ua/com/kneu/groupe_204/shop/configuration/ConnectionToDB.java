package ua.com.kneu.groupe_204.shop.configuration;


import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class ConnectionToDB {

    public Connection getConnectionToDB() {

        Connection connection = null;

        try {
            connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/shop_204_2025","root","root1234");

            System.out.println("Connection to DB!!");

        } catch (SQLException e) {
            System.out.println("No connection!");
            e.printStackTrace();
            throw new RuntimeException(e);
        }


        return connection;
    }

}
