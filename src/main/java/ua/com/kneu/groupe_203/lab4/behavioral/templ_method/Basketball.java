package ua.com.kneu.groupe_203.lab4.behavioral.templ_method;

public class Basketball implements Game {
    @Override
    public void init() {
        System.out.println(
                "init basketball"
        );
    }

    @Override
    public void play() {
        System.out.println("play basketball");
    }

    @Override
    public void end() {
        System.out.println("end basketball");
    }
}
