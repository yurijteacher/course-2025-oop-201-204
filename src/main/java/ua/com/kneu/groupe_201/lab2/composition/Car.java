package ua.com.kneu.groupe_201.lab2.composition;

public class Car {

    private int id;
    private String brand;
    private String model;
    private int year;
    private Engine engine;

    public Car(){
        engine = new Engine();
    }


}
