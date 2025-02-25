package ua.com.kneu.unit4.test1;

public class RobotProtected {

    protected double x = 0;
    protected double y = 0;
    protected double course = 100;
    protected double speed = 1;
    protected double distance = 100;


    public static void main(String[] args) {

        RobotProtected robotProtected = new RobotProtected();
        robotProtected.x = 100;
        robotProtected.y = 100;
        robotProtected.course = 100;

        System.out.println(robotProtected);
    }

    @Override
    public String toString() {
        return "RobotProtected{" +
                "x=" + x +
                ", y=" + y +
                ", course=" + course +
                ", speed=" + speed +
                ", distance=" + distance +
                '}';
    }
}
