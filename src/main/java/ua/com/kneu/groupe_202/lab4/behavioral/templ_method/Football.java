package ua.com.kneu.groupe_202.lab4.behavioral.templ_method;

public class Football implements Game{


    @Override
    public void init() {
        System.out.println("init football");
    }

    @Override
    public void play() {
        System.out.println("play football");
    }

    @Override
    public void end() {
        System.out.println("end football");
    }
}
