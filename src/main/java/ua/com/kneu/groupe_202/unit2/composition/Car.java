package ua.com.kneu.groupe_202.unit2.composition;


public class Car {

    private Long id;
    private String name;
    private String transmission;
    private double size;

    private Engine engine;

    public Car() {
       engine = new Engine();
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

    public String getTransmission() {
        return transmission;
    }

    public void setTransmission(String transmission) {
        this.transmission = transmission;
    }

    public double getSize() {
        return size;
    }

    public void setSize(double size) {
        this.size = size;
    }


    @Override
    public String toString() {
        return "Car{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", transmission='" + transmission + '\'' +
                ", size=" + size +
                ", engine=" + engine +
                '}';
    }
}
