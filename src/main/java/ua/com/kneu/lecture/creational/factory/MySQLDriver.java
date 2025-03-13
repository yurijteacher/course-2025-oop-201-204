package ua.com.kneu.lecture.creational.factory;

public class MySQLDriver implements Driver{

    @Override
    public Object getConnection(String user, String pass, String url) {
        return "connection to MySQL";
    }

    @Override
    public void execute(String sql) {
        System.out.println("sql: " + sql);
    }
}
