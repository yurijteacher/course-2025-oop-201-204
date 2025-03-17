package ua.com.kneu.groupe_203.lab2.generalization;

public class RobotExt extends Robot {

    public RobotExt() {
    }

    public RobotExt(Long id, double x, double y, double course, double distance) {
        super(id, x, y, course, distance);
    }

    public RobotExt(Long id, double x, double y, double course) {
        super(id, x, y, course);
    }

    @Override
    public String toString(){
        return super.toString() + " Hello!";
    }
}
