package ua.com.kneu.lecture.creational.prototype;

public class Robot implements Cloneable{

    private String model;
    private String color;

    public Robot() {
    }

    public Robot(String model, String color) {
        this.model = model;
        this.color = color;
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

    @Override
    public Robot clone(String model, String color) {
        return new Robot(model, color);
    }

    @Override
    public String toString() {
        return "Robot{" +
                "model='" + model + '\'' +
                ", color='" + color + '\'' +
                '}';
    }
}
