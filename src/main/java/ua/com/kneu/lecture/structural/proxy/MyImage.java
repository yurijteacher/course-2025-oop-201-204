package ua.com.kneu.lecture.structural.proxy;

public class MyImage implements Image{

    String file;

    public MyImage(String file) {
        this.file = file;
        System.out.println("Loaded image " + file);
    }

    @Override
    public void display() {
        System.out.println("Open " + file);
    }
}
