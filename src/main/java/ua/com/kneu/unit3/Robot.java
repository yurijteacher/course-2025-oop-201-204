package ua.com.kneu.unit3;

public class Robot {

    double x = 0;
    double y = 0;
    double course = 100;
    double speed = 1;
    double distance = 100;

    public Robot() {}

    public static void main(String[] args) {

        Robot robot = new Robot();

        System.out.println(robot.toString());
    //    System.out.println(robot.x + " " + robot.y+ " " + robot.course);

    }

    @Override
    public String toString() {
        return "Robot{" +
                "x=" + x +
                ", y=" + y +
                ", course=" + course +
                ", speed=" + speed +
                ", distance=" + distance +
                '}';
    }
}
