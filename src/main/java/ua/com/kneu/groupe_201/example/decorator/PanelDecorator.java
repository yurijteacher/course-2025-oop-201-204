package ua.com.kneu.groupe_201.example.decorator;

public class PanelDecorator extends Decorator{

    public PanelDecorator(Component component) {
        super(component);
    }

    @Override
    public void afterDraw() {
        System.out.println("Panel Decorator");
    }
}
