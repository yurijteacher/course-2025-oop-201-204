package ua.com.kneu.groupe_203.unit3.structural_patterns.composite;

import java.util.ArrayList;
import java.util.List;

public class RobotComposite implements Composite {

    List<Composite> robots = new ArrayList<>();

    public void add(Composite compositeT) {
        robots.add(compositeT);
    }

    public void remove(Composite robot) {
        robots.remove(robot);
    }

    @Override
    public void action() {
        for (Composite r : robots) {
            r.action();
        }
    }
}
