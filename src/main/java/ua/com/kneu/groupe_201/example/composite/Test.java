package ua.com.kneu.groupe_201.example.composite;

public class Test {

    public static void main(String[] args) {


        CompositeRobot composite1 =new CompositeRobot();
        CompositeRobot composite2 =new CompositeRobot();
        CompositeRobot composite =new CompositeRobot();

        RobotT1000 t1000 = new RobotT1000();
        RobotT2000 t2000 = new RobotT2000();
        RobotT3000 t3000 = new RobotT3000();

        composite1.addRobot(t1000);

        composite2.addRobot(t2000);
        composite.addRobot(t3000);

        composite.addRobot(composite1);
        composite.addRobot(composite2);

        composite.active();


        composite.removeRobot(t1000);

        RobotT1000 robotT1001= new RobotT1000();

        composite.addRobot(robotT1001);

        composite.active();

    }

}
