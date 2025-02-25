package ua.com.kneu.unit4.test1;

public class RobotPrivate {

    private double x = 0;
    private double y = 0;
    private double course = 100;
    private double speed = 1;
    private double distance = 100;

    public static void main(String[] args) {

        RobotPrivate robotPrivate = new RobotPrivate();
        robotPrivate.x = 10;

        System.out.println(robotPrivate);

    }

    @Override
    public String toString() {
        return "RobotPrivate{" +
                "x=" + x +
                ", y=" + y +
                ", course=" + course +
                ", speed=" + speed +
                ", distance=" + distance +
                '}';
    }
}
