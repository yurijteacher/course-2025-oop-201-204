package ua.com.kneu.groupe_202.unit2.generalization;

public class RobotExt extends Robot {

    private double distance = 0;

    @Override
    public String toString() {
        return "RobotExt{" +
                "" + super.toString() +
                "distance=" + distance +
                '}';
    }
}
