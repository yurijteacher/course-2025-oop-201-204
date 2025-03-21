package ua.com.kneu.groupe_202.unit2.composition;

public class Engine {

    private Long id;
    private String model;
    private double power;

    public Engine() {
    }

    public Engine(Long id, String model, double power) {
        this.id = id;
        this.model = model;
        this.power = power;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public double getPower() {
        return power;
    }

    public void setPower(double power) {
        this.power = power;
    }

    @Override
    public String toString() {
        return "Engine{" +
                "id=" + id +
                ", model='" + model + '\'' +
                ", power=" + power +
                '}';
    }
}
