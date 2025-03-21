package ua.com.kneu.groupe_202.lab2.homework.online_shop;

public class Delivery {

    private Long id;
    private String name;
    private double values;

    public Delivery() {
    }

    public Delivery(Long id, String name, double values) {
        this.id = id;
        this.name = name;
        this.values = values;
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

    public double getValues() {
        return values;
    }

    public void setValues(double values) {
        this.values = values;
    }

    @Override
    public String toString() {
        return "Delivery{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", values=" + values +
                '}';
    }
}
