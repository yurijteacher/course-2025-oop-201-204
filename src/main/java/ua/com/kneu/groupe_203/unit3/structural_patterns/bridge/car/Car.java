package ua.com.kneu.groupe_203.unit3.structural_patterns.bridge.car;

import ua.com.kneu.groupe_203.unit3.structural_patterns.bridge.maker.Maker;

public abstract class Car {

    Maker maker;

    public Car(Maker maker) {
        this.maker = maker;
    }

    public abstract void carDetails();
}
