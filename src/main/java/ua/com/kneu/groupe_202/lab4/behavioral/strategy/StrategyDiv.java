package ua.com.kneu.groupe_202.lab4.behavioral.strategy;

public class StrategyDiv implements Calculation{
    @Override
    public double execute(double a, double b) {

        double result = (b==0) ? 0 : a / b;

        return result;

//                (b==0) ? 0 : a/b;
    }
}
