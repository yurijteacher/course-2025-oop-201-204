package ua.com.kneu.groupe_203.lab2.aggregation;

public class Car {

    private Long id;
    private String maker;
    private String model;
    private Engine engine;

    public Car() {
    }

    public Car(Engine engine) {
        this.engine = engine;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getMaker() {
        return maker;
    }

    public void setMaker(String maker) {
        this.maker = maker;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public Engine getEngine() {
        return engine;
    }

    public void setEngine(Engine engine) {
        this.engine = engine;
    }

    @Override
    public String toString() {
        return "Car{" +
                "id=" + id +
                ", maker='" + maker + '\'' +
                ", model='" + model + '\'' +
                ", engine=" + engine +
                '}';
    }
}
