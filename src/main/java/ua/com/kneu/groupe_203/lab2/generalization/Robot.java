package ua.com.kneu.groupe_203.lab2.generalization;

public class Robot {

    private Long id;
    private double x;
    private double y;
    private double course;
    private double distance;

    public Robot() {
    }

    public Robot(Long id, double x, double y, double course, double distance) {
        this.id = id;
        this.x = x;
        this.y = y;
        this.course = course;
        this.distance = distance;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public double getX() {
        return x;
    }

    public void setX(double x) {
        this.x = x;
    }

    public double getY() {
        return y;
    }

    public void setY(double y) {
        this.y = y;
    }

    public double getCourse() {
        return course;
    }

    public void setCourse(double course) {
        this.course = course;
    }

    public double getDistance() {
        return distance;
    }

    public void setDistance(double distance) {
        this.distance = distance;
    }

    public Robot(Long id, double x, double y, double course) {}


    @Override
    public String toString() {
        return "Robot{" +
                "id=" + id +
                ", x=" + x +
                ", y=" + y +
                ", course=" + course +
                ", distance=" + distance +
                '}';
    }
}
