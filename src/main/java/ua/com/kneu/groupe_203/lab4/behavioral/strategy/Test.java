package ua.com.kneu.groupe_203.lab4.behavioral.strategy;

public class Test {

    public static void main(String[] args) {

        StrategyAdd strategyAdd = new StrategyAdd();
        StrategySub strategySub = new StrategySub();

        ContextStrategy context = new ContextStrategy(strategySub);

        System.out.println(context.execute(5, 6));


    }

}
