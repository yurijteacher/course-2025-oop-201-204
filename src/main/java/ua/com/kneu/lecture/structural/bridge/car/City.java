package ua.com.kneu.lecture.structural.bridge.car;

import ua.com.kneu.lecture.structural.bridge.maker.Maker;

public class City extends Car{
    public City(Maker maker) {
        super(maker);
    }

    @Override
    public void details() {
        System.out.println(maker.setMaker());
        System.out.println("This is a city car!");

    }
}
