package ua.com.kneu.groupe_203.unit3.structural_patterns.composite;

public class Test {

    public static void main(String[] args) {

        RobotT800 t800 = new RobotT800();
        RobotT1000 t1000 = new RobotT1000();
        RobotT2000 t2000 = new RobotT2000();

        RobotComposite composite1 = new RobotComposite();
        RobotComposite composite2 = new RobotComposite();

        RobotComposite composite3 = new RobotComposite();

        composite2.add(t800);

        composite1.add(t1000);
        composite1.add(t2000);

        composite3.add(composite1);
        composite3.add(composite2);

        composite3.action();


    }


}
