package ua.com.kneu.unit5;

import static java.lang.Math.*;

public class Robot {

    protected double x = 0;
    protected double y = 0;
    protected double course = 0;
    protected double distance = 0;

    public void forward(){

//        x = x + distance * cos(PI * course/180);
//        y = y + distance * sin(PI * course/180);

        x += distance * cos(PI * course/180);
        y += distance * sin(PI * course/180);
    }


    public Robot() {
    }

    public Robot(double x) {
        this.x = x;
    }

    public Robot(double x, double y) {
        this.x = x;
        this.y = y;
    }

//    public Robot(double course, double distance) {
//        this.course = course;
//        this.distance = distance;
//    }


    public Robot(double x, double y, double course) {
        this.x = x;
        this.y = y;
        this.course = course;
    }

    public Robot(double x, double y, double course, double distance) {
        this.x = x;
        this.y = y;
        this.course = course;
        this.distance = distance;
    }

    public static void main(String[] args) {

        Robot robot = new Robot();

        System.out.println(robot);

        robot.course = 45;
        robot.distance = 90;
        robot.forward();
        System.out.println(robot);


        robot.course = 90;
        robot.distance = 100;
        robot.forward();
        System.out.println(robot);



//        robot.x = 100;
//        robot.y = 100;
//        robot.course = 100;
//        robot.distance = 100;

//        Robot robot2 = new Robot(100);
//
//        Robot robot3 = new Robot(100, 100,200,400);
//
//        System.out.println(robot);
//        System.out.println(robot2);
//        System.out.println(robot3);
    }

    @Override
    public String toString() {
        return "Robot{" +
                "x=" + x +
                ", y=" + y +
                ", course=" + course +
                ", distance=" + distance +
                '}';
    }
}
