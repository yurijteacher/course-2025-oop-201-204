package ua.com.kneu.groupe_202.lab4.behavioral.strategy;

public class StrategyAdd implements Calculation{
    @Override
    public double execute(double a, double b) {
        return a+b;
    }
}
