package ua.com.kneu.lecture.structural.bridge.car;

import ua.com.kneu.lecture.structural.bridge.maker.Maker;

public class Sport extends Car{


    public Sport(Maker maker) {
        super(maker);
    }

    @Override
    public void details() {
        System.out.println(maker.setMaker());
        System.out.println("This is a car for Sport!");

    }
}
