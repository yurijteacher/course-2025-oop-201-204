package ua.com.kneu.unit5;

public class RobotExt extends Robot {

    private double totalDistance = 0;


    public RobotExt(double x, double y, double course, double distance) {
        super(x, y, course, distance);
    }

    public static void main(String[] args) {

        RobotExt robotExt = new RobotExt(100,100,200,300);
        System.out.println(robotExt.toString());

        robotExt.x = 0;
        robotExt.y = 0;
        robotExt.course = 0;
        robotExt.distance = 0;

        System.out.println(robotExt);

        robotExt.course = 45;
        robotExt.distance = 100;
        robotExt.forward();
        System.out.println(robotExt);


        robotExt.course = 90;
        robotExt.distance = 200;
        robotExt.forward();
        System.out.println(robotExt);
    }

    @Override
    public void forward() {
        super.forward();
        totalDistance += distance;
    }

    @Override
    public String toString() {
        return "RobotExt{" +
                "totalDistance=" + totalDistance +", "+
                super.toString() +
                '}';
    }
}
