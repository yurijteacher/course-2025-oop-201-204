package ua.com.kneu.unit4.test2;

import ua.com.kneu.unit4.test1.RobotDefault;
import ua.com.kneu.unit4.test1.RobotProtected;
import ua.com.kneu.unit4.test1.RobotPublic;

public class RobotManager2 {

    public static void main(String[] args) {

        RobotDefault robotDefault = new RobotDefault();

//        robotDefault.x = 101;
//
//        System.out.println(robotDefault.x);

        System.out.println(robotDefault);


        RobotPublic robotPublic = new RobotPublic();
        robotPublic.course = 200;
        robotPublic.speed = 200;
        robotPublic.distance = 200;
        robotPublic.y = 10;
        robotPublic.x = 5;

        System.out.println(robotPublic);


        RobotProtected robotProtected = new RobotProtected();
//        robotProtected.x = 100;
//        robotProtected.y = 100;
//        robotProtected.course = 100;

        System.out.println(robotProtected);


    }
}
