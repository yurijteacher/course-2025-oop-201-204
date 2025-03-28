package ua.com.kneu.groupe_201.example.flyweight;

import java.util.HashMap;
import java.util.Map;

public class Factory {

    private Map<String, Driver> drivers = new HashMap<>();

    public Driver getDriver(String db) {

        Driver driver = drivers.get(db);
        if (driver == null) {
            switch (db) {
                case "mysql":
                    driver = new MySQLDriver();
                    break;
                case "postgres":
                    driver = new PostgresDriver();
                    break;
                case "db2":
                    driver = new Db2Driver();
                    break;
            }
            drivers.put(db, driver);
        }
        return driver;
    }


}
