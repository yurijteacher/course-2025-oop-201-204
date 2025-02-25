package ua.com.kneu.unit4.test1;

public class RobotManager {

    public static void main(String[] args) {

        // Default
        RobotDefault robotDefault = new RobotDefault();
        robotDefault.x = 101;
        System.out.println(robotDefault.x);
        System.out.println(robotDefault);

        // Private
        RobotPrivate robotPrivate = new RobotPrivate();
        // robotPrivate.x = 10;

        // Public
        RobotPublic robotPublic = new RobotPublic();
        robotPublic.course = 200;
        robotPublic.speed = 200;
        robotPublic.distance = 200;
        robotPublic.y = 10;
        robotPublic.x = 5;

        System.out.println(robotPublic);

        // Protected
        RobotProtected robotProtected = new RobotProtected();
        robotProtected.x = 100;
        robotProtected.y = 100;
        robotProtected.course = 100;

        System.out.println(robotProtected);

    }



}
