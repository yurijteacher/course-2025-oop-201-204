package ua.com.kneu.lecture.structural.proxy;

public class Test {

    public static void main(String[] args) {

        MyImage myImage = new MyImage("/file.jpg");
        myImage.display();

        Proxy proxy = new Proxy("/file.jpg");
        proxy.display();

    }

}
