package ua.com.kneu.groupe_201.example.bridge.car;

import ua.com.kneu.groupe_201.example.bridge.maker.Maker;

public abstract class Car implements Maker{

    private Maker maker;

    public Car(Maker maker) {
        this.maker = maker;
    }


    @Override
    public void getMaker(){
        maker.getMaker();
        getDetailsCar();
    }

    public abstract void getDetailsCar();
}
