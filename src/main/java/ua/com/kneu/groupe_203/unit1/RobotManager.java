package ua.com.kneu.groupe_203.unit1;

public class RobotManager {

    // psvm + [tab]
    public static void main(String[] args) {

        Robot robot = new Robot();
        // robot.x =0;
        robot.setX(5);

        robot.setY(5);
        robot.setCourse(1000);
        robot.setDistance(123);

        System.out.println("x: "+robot.getX());

        System.out.println(robot);


        Robot robot1 = new Robot(5);
        System.out.println(robot1);

        Robot robot2 = new Robot(10, 10);
        System.out.println(robot2);

        Robot robot3 = new Robot(30, 30, 15);
        System.out.println(robot3);

        Robot robot4 = new Robot(40, 40, 25, 20);
        System.out.println(robot3);

    }

}
