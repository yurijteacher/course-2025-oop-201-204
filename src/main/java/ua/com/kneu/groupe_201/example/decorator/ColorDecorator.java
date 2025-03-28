package ua.com.kneu.groupe_201.example.decorator;

public class ColorDecorator extends Decorator{

    public ColorDecorator(Component component) {
        super(component);
    }

    @Override
    public void afterDraw() {
        System.out.println("Color Decorator");
    }
}
