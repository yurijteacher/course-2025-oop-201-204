package ua.com.kneu.groupe_203.unit3.structural_patterns.proxy;

public class Proxy implements Image{

    String file;

    MyImage myImage;

    public Proxy(String file) {
        this.file = file;
        myImage = new MyImage(file);
    }

    @Override
    public void display(String file) {
        if(myImage == null) {
            myImage = new MyImage(file);
        }
            System.out.println("Copy file: " + file);

    }
}
