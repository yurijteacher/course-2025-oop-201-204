package ua.com.kneu.groupe_201.example.bridge;

import ua.com.kneu.groupe_201.example.bridge.car.Car;
import ua.com.kneu.groupe_201.example.bridge.car.CityCar;
import ua.com.kneu.groupe_201.example.bridge.maker.BmwCo;

public class Test {

    public static void main(String[] args) {

        Car car = new CityCar(new BmwCo());
        car.getMaker();


    }

}
