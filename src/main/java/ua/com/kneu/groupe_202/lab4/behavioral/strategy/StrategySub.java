package ua.com.kneu.groupe_202.lab4.behavioral.strategy;

public class StrategySub implements Calculation{
    @Override
    public double execute(double a, double b) {
        return a-b;
    }
}
