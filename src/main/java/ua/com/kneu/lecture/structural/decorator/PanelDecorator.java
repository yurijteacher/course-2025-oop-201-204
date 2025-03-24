package ua.com.kneu.lecture.structural.decorator;

public class PanelDecorator extends Decorator{

    public PanelDecorator(Component component) {
        super(component);
    }

    @Override
    public void afterDraw() {
        System.out.println("Panel decorator");
    }
}
