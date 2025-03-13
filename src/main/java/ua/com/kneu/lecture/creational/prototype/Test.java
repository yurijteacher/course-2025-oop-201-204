package ua.com.kneu.lecture.creational.prototype;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class Test {

    public static void main(String[] args) {

        Robot robot = new Robot();

        List<Robot> robots = new ArrayList<>();

        for (int i = 0; i < 100; i++) {
            robots.add(robot.clone("T" + i, "color" + new Random().nextInt(100)));
        }

        for (Robot r : robots) {
            System.out.println(r);
        }

    }

}
