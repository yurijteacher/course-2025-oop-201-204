package ua.com.kneu.groupe_201.example.proxy;

public class Proxy implements Image{

    String file;
    MyImage myImage;

    public Proxy(String file) {
        this.file = file;
        if (myImage == null) {
            myImage = new MyImage(file);
        }
    }

    @Override
    public void display() {
        System.out.println("Copy :" + file);
    }
}
