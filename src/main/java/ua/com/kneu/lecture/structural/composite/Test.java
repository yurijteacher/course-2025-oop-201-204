package ua.com.kneu.lecture.structural.composite;

public class Test {

    public static void main(String[] args) {

        RobotT1000 t1000 = new RobotT1000();
        RobotT2000 t2000 = new RobotT2000();
        RobotT3000 t3000 = new RobotT3000();

        RobotComposite composite1 = new RobotComposite();
        RobotComposite composite2 = new RobotComposite();

        RobotComposite composite3 = new RobotComposite();

        composite1.add(t1000);
        composite1.add(t2000);

        composite2.add(t3000);

        composite3.add(composite1);
        composite1.add(t3000);


    }

}
