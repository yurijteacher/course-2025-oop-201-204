package ua.com.kneu.groupe_203.lab2.composition;

public class Car {

    private Long id;
    private String name;
    private String brand;
    private Engine engine;

    public Car() {
        engine = new Engine();
        engine.setName("CRV");
        engine.setId(1L);
        engine.setDescription("asdsa sadf  sad");
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }
}
