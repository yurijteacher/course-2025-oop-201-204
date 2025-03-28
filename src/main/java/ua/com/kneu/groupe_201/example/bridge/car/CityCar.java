package ua.com.kneu.groupe_201.example.bridge.car;

import ua.com.kneu.groupe_201.example.bridge.maker.Maker;

public class CityCar extends Car{

    public CityCar(Maker maker) {
        super(maker);
    }

    @Override
    public void getDetailsCar() {
        System.out.println("City car");
    }
}
