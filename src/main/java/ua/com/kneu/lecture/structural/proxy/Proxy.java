package ua.com.kneu.lecture.structural.proxy;

public class Proxy implements Image{

    private String file;

    MyImage myImage = null;

    public Proxy(String file) {
        this.file = file;
        myImage = new MyImage(file);
    }

    @Override
    public void display() {
        if (myImage != null) {
            myImage = new MyImage(file);
        }
        System.out.println("copy" + file);
    }
}
