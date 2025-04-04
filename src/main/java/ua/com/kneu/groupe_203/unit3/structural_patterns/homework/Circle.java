package ua.com.kneu.groupe_203.unit3.structural_patterns.homework;

public class Circle implements Shape {

    int r = 10;

    @Override

    public void draw(int x, int y) {

        System.out.println("x : " + x + ", y: " + y +", r: "+r);

    }

}