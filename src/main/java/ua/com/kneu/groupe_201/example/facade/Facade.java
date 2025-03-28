package ua.com.kneu.groupe_201.example.facade;

public class Facade {

    public void  print(){

        Hello hello = new Hello();
        World world = new World();
        hello.printHello();
        world.printWorld();
        System.out.print("!!");

    }

}
