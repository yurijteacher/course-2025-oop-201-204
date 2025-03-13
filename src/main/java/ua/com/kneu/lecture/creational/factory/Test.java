package ua.com.kneu.lecture.creational.factory;

public class Test {

    public static void main(String[] args) {

        Driver driver1 = new PostgresDriver();
        driver1.getConnection("root","1234", "jdbc:postgres://localhost:5432/test");

        Driver driver2 = new MySQLDriver();
        driver2.getConnection("root","1234", "jdbc:mysql://localhost:3306/test");


        Factory factory = new Factory();

        Driver driver = factory.getDriver("mysql");
        System.out.println(driver.getConnection("root", "1234", "jdbc:mysql://localhost:3306/test"));
        driver.execute("select * from table");



    }

}
