package ua.com.kneu.groupe_203.unit3.structural_patterns.proxy;

public class Test {

    public static void main(String[] args) {

        MyImage myImage = new MyImage("/1.jpg");
        myImage.display("/1.jpg");


        Proxy proxy = new Proxy("/2.jpg");
        proxy.display("/2.jpg");
    }

}
