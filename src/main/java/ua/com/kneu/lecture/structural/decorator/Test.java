package ua.com.kneu.lecture.structural.decorator;

public class Test {

    public static void main(String[] args) {

        Component component = new ColorDecorator(new PanelDecorator(new ColorDecorator(new TextComponent())));

        component.draw();


    }

}
