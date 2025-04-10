package ua.com.kneu.groupe_201.example.flyweight;

public class PostgresDriver implements Driver {

    @Override
    public Object getConnection(String user, String pass, String url) {
        return "connection to postgres";
    }

    @Override
    public void execute(String sql) {
        System.out.println("SQL (Postgres): " + sql);
    }
}
