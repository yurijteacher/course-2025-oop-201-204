package ua.com.kneu.groupe_203.unit3.structural_patterns.decorator;

public abstract class Decorator implements Component{

    Component component;

    public Decorator(Component component) {
        this.component = component;
    }

    @Override
    public void draw(){
        component.draw();
        afterDraw();
    }

    public abstract void afterDraw();


}
