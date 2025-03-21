package ua.com.kneu.groupe_202.unit2.generalization;

public class Robot {

    private Long id;
    private String model;
    private String color;
    private double speed;

    @Override
    public String toString() {
        return "Robot{" +
                "id=" + id +
                ", model='" + model + '\'' +
                ", color='" + color + '\'' +
                ", speed=" + speed +
                '}';
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

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public double getSpeed() {
        return speed;
    }

    public void setSpeed(double speed) {
        this.speed = speed;
    }

    public Robot() {
    }

    public Robot(Long id, String model, String color, double speed) {
        this.id = id;
        this.model = model;
        this.color = color;
        this.speed = speed;
    }

}
