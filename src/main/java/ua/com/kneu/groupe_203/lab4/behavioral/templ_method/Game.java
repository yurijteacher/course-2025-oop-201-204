package ua.com.kneu.groupe_203.lab4.behavioral.templ_method;

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
