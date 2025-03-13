package ua.com.kneu.groupe_204.unit2;

public class RobotExt extends Robot {

    private double totalDistance = 0;

    @Override
    public void forward() {
        super.forward();
        totalDistance += distance;
    }

    public static void main(String[] args) {

        RobotExt robotExt = new RobotExt();
        robotExt.setX(0);
        robotExt.setY(0);
        robotExt.setCourse(90);
        robotExt.course = 90;
        robotExt.distance = 100;

        System.out.println(robotExt);

        robotExt.forward();
        System.out.println(robotExt);

    }


    @Override
    public String toString() {
        return
                super.toString() +
                "RobotExt{" +
                "totalDistance=" + totalDistance +
                '}';
    }
}
