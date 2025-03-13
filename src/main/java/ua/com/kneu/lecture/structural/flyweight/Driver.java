package ua.com.kneu.lecture.structural.flyweight;

public interface Driver {

    Object getConnection(String user, String pass, String url);

    void execute(String sql);

    default void executeBatch(String sql) {
        System.out.println(sql);
    }

}
