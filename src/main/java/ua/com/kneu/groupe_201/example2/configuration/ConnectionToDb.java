package ua.com.kneu.groupe_201.example2.configuration;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class ConnectionToDb {


    public Connection getConnection() {

        Connection connection = null;

        String url = "jdbc:mysql://localhost:3306/shop_201_2025";
        String user = "root";
        String pass = "root1234";


        try {
            connection = DriverManager.getConnection(url, user, pass);
            System.out.println("Connection successful");
        } catch (SQLException e) {
            System.out.println("Connection error");
            e.printStackTrace();
        }


        return connection;
    }


}
