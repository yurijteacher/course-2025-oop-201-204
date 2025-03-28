package ua.com.kneu.groupe_201.example.proxy;

public class MyImage implements Image{

    String file;
    public MyImage(String file) {
        this.file = file;
        load();
    }

    private void load() {
        System.out.println("Loading image: " + file);
    }


    @Override
    public void display() {
        System.out.println("Opening image: " + file);
    }
}
