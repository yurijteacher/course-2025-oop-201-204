package ua.com.kneu.groupe_203.unit3.structural_patterns.bridge.car;

import ua.com.kneu.groupe_203.unit3.structural_patterns.bridge.maker.Maker;

public class SportCar extends Car{
    public SportCar(Maker maker) {
        super(maker);
    }

    @Override
    public void carDetails() {
        maker.getMaker();
        System.out.println("Sport Car");
    }
}
