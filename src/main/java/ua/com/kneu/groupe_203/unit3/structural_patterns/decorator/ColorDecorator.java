package ua.com.kneu.groupe_203.unit3.structural_patterns.decorator;

public class ColorDecorator extends Decorator{

    public ColorDecorator(Component component) {
        super(component);
    }

    @Override
    public void afterDraw() {
        System.out.println("Color decorated");
    }
}
