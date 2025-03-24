package ua.com.kneu.lecture.structural.facade;

public class Facade {

    public void print(){
        Hello hello = new Hello();
        hello.printHello();

        World world = new World();
        world.printWorld();
    }

}
