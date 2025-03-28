package ua.com.kneu.groupe_201.example.decorator;

public class Test {

    public static void main(String[] args) {

        Component component = new PanelDecorator(new PanelDecorator(new ColorDecorator(new ComponentText())));
        component.draw();

    }

}
