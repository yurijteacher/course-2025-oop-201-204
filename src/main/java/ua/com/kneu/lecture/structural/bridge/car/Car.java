package ua.com.kneu.lecture.structural.bridge.car;

import ua.com.kneu.lecture.structural.bridge.maker.Maker;

public abstract class Car {

    Maker maker;

    public Car(Maker maker) {
        this.maker = maker;
    }

    public abstract void details();

}
