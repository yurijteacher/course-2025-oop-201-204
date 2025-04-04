package ua.com.kneu.groupe_203.unit3.structural_patterns.decorator;

public class ComponentText implements Component{
    @Override
    public void draw() {
        System.out.println("Draw text");
    }
}
