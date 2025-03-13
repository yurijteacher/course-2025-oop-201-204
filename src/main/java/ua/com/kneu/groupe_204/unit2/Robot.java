package ua.com.kneu.groupe_204.unit2;

import java.util.Objects;

import static java.lang.Math.*;

public class Robot {

    private double x;
    private double y;
    double course;
    protected double distance;

    private double speed;


    public void forward(){
        x += distance * cos (PI*course/180);
        y += distance * sin (PI*course/180);
    }


    public Robot() {
    }

    public Robot(double x, double y, double course, double distance) {
        this.x = x;
        this.y = y;
        this.course = course;
        this.distance = distance;
    }

    public void setX(double x) {
        this.x= x;
    }

    public void setY(double y) {
        this.y = y;
    }

    public void setCourse(double course) {
        this.course = course;
    }

    public void setDistance(double distance) {
        this.distance = distance;
    }


    public double getX(){
        return x;
    }

    public double getY() {
        return y;
    }

    public double getCourse() {
        return course;
    }

    public double getDistance() {
        return distance;
    }

    @Override
    public String toString() {
        return "Robot{" +
                "x=" + x +
                ", y=" + y +
                ", course=" + course +
                ", distance=" + distance +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Robot robot)) return false;
        return Double.compare(getX(), robot.getX()) == 0 && Double.compare(getY(), robot.getY()) == 0 && Double.compare(getCourse(), robot.getCourse()) == 0 && Double.compare(getDistance(), robot.getDistance()) == 0;
    }

    @Override
    public int hashCode() {
        return Objects.hash(getX(), getY(), getCourse(), getDistance());
    }
}
