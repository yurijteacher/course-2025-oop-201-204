package ua.com.kneu.lecture.creational.builder;

public class Car {

    private String model = "Seat";
    private ColorCar color = ColorCar.yellow;
    private Engine engine = Engine.l2000;
    private Transmission transmission = Transmission.auto;
    private TypeByRoad typeByRoad = TypeByRoad.sport;

    public Car() {
    }

    public Car(String model, ColorCar color, Engine engine, Transmission transmission, TypeByRoad typeByRoad) {
        this.model = model;
        this.color = color;
        this.engine = engine;
        this.transmission = transmission;
        this.typeByRoad = typeByRoad;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public ColorCar getColor() {
        return color;
    }

    public void setColor(ColorCar color) {
        this.color = color;
    }

    public Engine getEngine() {
        return engine;
    }

    public void setEngine(Engine engine) {
        this.engine = engine;
    }

    public Transmission getTransmission() {
        return transmission;
    }

    public void setTransmission(Transmission transmission) {
        this.transmission = transmission;
    }

    public TypeByRoad getTypeByRoad() {
        return typeByRoad;
    }

    public void setTypeByRoad(TypeByRoad typeByRoad) {
        this.typeByRoad = typeByRoad;
    }

    @Override
    public String toString() {
        return "Car{" +
                "model='" + model + '\'' +
                ", color=" + color +
                ", engine=" + engine +
                ", transmission=" + transmission +
                ", typeByRoad=" + typeByRoad +
                '}';
    }
}
