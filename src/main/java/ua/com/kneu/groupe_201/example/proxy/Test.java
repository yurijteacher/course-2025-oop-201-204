package ua.com.kneu.groupe_201.example.proxy;

public class Test {

    public static void main(String[] args) {

        MyImage myImage = new MyImage("/1.jpg");
        myImage.display();

        Proxy proxy = new Proxy("/1.jpg");
        proxy.display();

    }

}
