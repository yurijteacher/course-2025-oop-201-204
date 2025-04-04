package ua.com.kneu.groupe_203.unit3.structural_patterns.fleweight;

public interface Driver {

    Object getConnection(String user, String pass, String url);

    void execute(String sql);

    default void executeBatch(String sql) {
        System.out.println(sql);
    }

}
