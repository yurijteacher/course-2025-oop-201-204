package ua.com.kneu.lecture.creational.factory;

public class Factory {

    public Driver getDriver(String db) {

        Driver driver = null;

        switch (db) {
            case "mysql": driver = new MySQLDriver();
                          break;
            case "postgres": driver = new PostgresDriver();
                break;
            case "db2": driver = new Db2Driver();
                break;
        }

        return driver;
    }


}
