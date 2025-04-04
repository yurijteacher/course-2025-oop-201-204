package ua.com.kneu.groupe_203.unit3.structural_patterns.homework;

public class Square implements Shape {

    int a = 20;

    @Override

    public void draw(int x, int y) {

        System.out.println("x: " + x + ", y: "+ y +", a: " + a);

    }

}
