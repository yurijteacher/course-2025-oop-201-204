package ua.com.kneu.groupe_203.unit3.structural_patterns.bridge.maker;

public class Seat implements Maker{
    @Override
    public void getMaker() {
        System.out.println("Seat Co");
    }
}
