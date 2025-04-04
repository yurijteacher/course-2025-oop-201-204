package ua.com.kneu.groupe_203.unit3.structural_patterns.bridge;

import ua.com.kneu.groupe_203.unit3.structural_patterns.bridge.car.Car;
import ua.com.kneu.groupe_203.unit3.structural_patterns.bridge.car.CityCar;
import ua.com.kneu.groupe_203.unit3.structural_patterns.bridge.car.SportCar;
import ua.com.kneu.groupe_203.unit3.structural_patterns.bridge.maker.Bmw;
import ua.com.kneu.groupe_203.unit3.structural_patterns.bridge.maker.Seat;

public class Test {

    public static void main(String[] args) {

        Seat seat = new Seat();
        Bmw bmw = new Bmw();

        Car seat2000 = new CityCar(new Seat());
        seat2000.carDetails();

        Car bmwM3 = new SportCar(new Bmw());
        bmwM3.carDetails();

    }

}
