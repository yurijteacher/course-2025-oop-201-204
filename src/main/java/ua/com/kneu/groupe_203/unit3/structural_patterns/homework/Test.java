package ua.com.kneu.groupe_203.unit3.structural_patterns.homework;

import java.util.ArrayList;
import java.util.Random;

public class Test {


    public static void main(String[] args) {

        FactoryShare factoryShare = new FactoryShare();

        ArrayList<Shape> shapes = new ArrayList<>();

        shapes.add(factoryShare.getShape("квадрат"));

        shapes.add(factoryShare.getShape("точка"));

        shapes.add(factoryShare.getShape("коло"));


        for(Shape shape : shapes){
            int x = new Random().nextInt(101);
            int y = new Random().nextInt(101);

            shape.draw(x, y);
        }

    }
}
