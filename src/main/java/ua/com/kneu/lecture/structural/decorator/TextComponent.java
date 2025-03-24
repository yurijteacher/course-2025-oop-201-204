package ua.com.kneu.lecture.structural.decorator;

public class TextComponent implements Component{

    @Override
    public void draw() {
        System.out.println("Draw text");
    }

}
