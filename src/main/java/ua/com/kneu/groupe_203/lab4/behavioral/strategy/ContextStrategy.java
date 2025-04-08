package ua.com.kneu.groupe_203.lab4.behavioral.strategy;

public class ContextStrategy implements Calculation {

    private Calculation calculation;

    public ContextStrategy(Calculation calculation) {
        this.calculation = calculation;
    }

    @Override
    public double execute(double a, double b) {
        return calculation.execute(a,b);
    }
}
