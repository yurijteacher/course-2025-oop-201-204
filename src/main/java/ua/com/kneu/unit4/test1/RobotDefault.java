package ua.com.kneu.unit4.test1;

import ua.com.kneu.unit3.Robot;

public class RobotDefault {

    double x = 0;
    double y = 0;
    double course = 100;
    double speed = 1;
    double distance = 100;

    public static void main(String[] args) {

        RobotDefault robotDefault = new RobotDefault();

        robotDefault.x = 101;

        System.out.println(robotDefault.x);

        System.out.println(robotDefault);
    }

    @Override
    public String toString() {
        return "RobotDefault{" +
                "x=" + x +
                ", y=" + y +
                ", course=" + course +
                ", speed=" + speed +
                ", distance=" + distance +
                '}';
    }
}
