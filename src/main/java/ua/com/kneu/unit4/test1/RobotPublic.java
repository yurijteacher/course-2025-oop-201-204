package ua.com.kneu.unit4.test1;

public class RobotPublic {

    public double x = 0;
    public double y = 0;
    public double course = 100;
    public double speed = 1;
    public double distance = 100;

    public static void main(String[] args) {

        RobotPublic robotPublic = new RobotPublic();
        robotPublic.course = 200;
        robotPublic.speed = 200;
        robotPublic.distance = 200;
        robotPublic.y = 10;
        robotPublic.x = 5;

        System.out.println(robotPublic);

    }

    @Override
    public String toString() {
        return "RobotPublic{" +
                "x=" + x +
                ", y=" + y +
                ", course=" + course +
                ", speed=" + speed +
                ", distance=" + distance +
                '}';
    }
}
