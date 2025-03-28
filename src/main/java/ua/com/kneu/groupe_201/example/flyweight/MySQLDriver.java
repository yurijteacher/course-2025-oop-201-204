package ua.com.kneu.groupe_201.example.flyweight;

public class MySQLDriver implements Driver {

    @Override
    public Object getConnection(String user, String pass, String url) {
        return "connection to MySQL";
    }

    @Override
    public void execute(String sql) {
        System.out.println("sql: " + sql);
    }
}
