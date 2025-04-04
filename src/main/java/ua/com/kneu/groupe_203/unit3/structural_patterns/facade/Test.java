package ua.com.kneu.groupe_203.unit3.structural_patterns.facade;

public class Test {

    public static void main(String[] args) {

        new Facade().print();
        new Facade().print();

        Facade facade = new Facade();

        facade.print();
        facade.print();

    }

}
