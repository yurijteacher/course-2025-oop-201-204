package ua.com.kneu.lecture.structural.composite;

import java.util.ArrayList;
import java.util.List;

public class RobotComposite implements Robot{

    List<Robot> robots = new ArrayList<>();

    public void add(Robot robot) {
        robots.add(robot);
    }

    public void remove(Robot robot) {
        robots.remove(robot);
    }

    @Override
    public void action() {
        for (Robot robot : robots) {
            robot.action();
        }
    }
}
