package ua.com.kneu.lecture.creational.builder;

public class BuilderCar {

    private String model = "Seat 2000";
    private ColorCar color = ColorCar.red;
    private Engine engine = Engine.l1600;
    private Transmission transmission = Transmission.auto;
    private TypeByRoad typeByRoad = TypeByRoad.city;

    public BuilderCar getModel(String model) {
        this.model = model;
        return this;
    }

    public BuilderCar getEngine(Engine engine) {
        this.engine = engine;
        return this;
    }

    public BuilderCar getColor(ColorCar color) {
        this.color = color;
        return this;
    }

    public BuilderCar getTransmission(Transmission transmission) {
     this.transmission = transmission;
        return this;
    }

    public BuilderCar getTypeByRoad(TypeByRoad typeByRoad) {
        this.typeByRoad = typeByRoad;
        return this;
    }

    public Car build() {
        Car car = new Car();

        car.setModel(model);
        car.setEngine(engine);
        car.setColor(color);
        car.setTransmission(transmission);
        car.setTypeByRoad(typeByRoad);

        return car;
    }



}
