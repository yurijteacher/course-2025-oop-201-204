package ua.com.kneu.groupe_203.unit3.structural_patterns.fleweight;

public class Db2Driver implements Driver {

    @Override
    public Object getConnection(String user, String pass, String url) {
        return "connection to Db2";
    }

    @Override
    public void execute(String sql) {
        System.out.println("sql Db2: " + sql);
    }
}
