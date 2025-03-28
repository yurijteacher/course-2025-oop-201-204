package ua.com.kneu.groupe_201.example.decorator;

public abstract class Decorator implements Component{

    private Component component;

    public Decorator(Component component) {
        this.component = component;
    }

    @Override
    public void draw() {
        component.draw();
        afterDraw();
    }

    public abstract void afterDraw();


}
