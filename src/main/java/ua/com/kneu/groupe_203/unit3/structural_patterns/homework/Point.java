package ua.com.kneu.groupe_203.unit3.structural_patterns.homework;

public class Point implements Shape{

    @Override
    public void draw(int x, int y) {
        System.out.println("point - x: "+ x + ", y: " + y);
    }
}
