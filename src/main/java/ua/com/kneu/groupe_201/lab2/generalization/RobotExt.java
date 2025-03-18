package ua.com.kneu.groupe_201.lab2.generalization;

public class RobotExt extends Robot {

    private double totalDistance = 0;

    @Override
    public String toString() {
        return "RobotExt{"
                + super.toString() +
                "totalDistance=" + totalDistance +
                '}';
    }
}
