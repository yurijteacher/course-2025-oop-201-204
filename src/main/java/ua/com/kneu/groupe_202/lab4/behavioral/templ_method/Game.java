package ua.com.kneu.groupe_202.lab4.behavioral.templ_method;

public interface Game {

    void init();
    void play();
    void end();

    default void templGame(){
        init();
        play();
        end();
    }



}
