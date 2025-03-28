package ua.com.kneu.groupe_201.example.composite;

import java.util.ArrayList;
import java.util.List;

public class CompositeRobot implements Robot{

    List<Robot> robots = new ArrayList<>();

    public void addRobot(Robot robot) {
        robots.add(robot);
    }

    public void removeRobot(Robot robot) {
        robots.remove(robot);
    }


    @Override
    public void active() {
        for (Robot robot : robots) {
            robot.active();
        }
    }
}
