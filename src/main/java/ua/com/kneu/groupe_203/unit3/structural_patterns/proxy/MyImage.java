package ua.com.kneu.groupe_203.unit3.structural_patterns.proxy;

public class MyImage implements Image{

    String file;

    public MyImage(String file) {
        this.file = file;
        load(file);
    }

    public void load(String file) {
        System.out.println("Loading image: " + file);
    }
    @Override
    public void display(String file) {
        System.out.println("Opening image: " + file);
    }
}
