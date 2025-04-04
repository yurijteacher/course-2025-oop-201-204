package ua.com.kneu.groupe_203.unit3.structural_patterns.fleweight;

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
