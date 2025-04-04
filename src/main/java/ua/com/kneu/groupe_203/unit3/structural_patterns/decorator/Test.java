package ua.com.kneu.groupe_203.unit3.structural_patterns.decorator;

public class Test {

    public static void main(String[] args) {
        Component componentText = new ColorDecorator(new PanelDecorator(new ColorDecorator(new ComponentText())));
        componentText.draw();
    }

}
