package ua.com.kneu.groupe_202.lab4.behavioral.strategy;

import javax.naming.Context;

public class Test {

    public static void main(String[] args) {

        StrategyAdd strategyAdd = new StrategyAdd();
        StrategySub strategySub = new StrategySub();

        ContextStrategy context = new ContextStrategy(strategySub);

        System.out.println(context.execute(5, 6));


    }

}
