package ua.com.kneu.groupe_203.unit3.structural_patterns.facade;

public class Facade {

    public void print(){

        Hello hello = new Hello();
        World world = new World();

        hello.printHello();
        world.printWorld();
        System.out.print("!!!");


    }

}
