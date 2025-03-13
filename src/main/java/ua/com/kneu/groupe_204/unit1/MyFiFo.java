package ua.com.kneu.groupe_204.unit1;

import java.util.LinkedList;
import java.util.Queue;

public class MyFiFo {

    public static void main(String[] args) {

        Queue<Integer> fifo = new LinkedList<>();
        fifo.add(1);
        fifo.add(2);
        fifo.add(3);

        int c = fifo.peek();
        System.out.println( "c: " + c +", " + fifo);

        int d = fifo.poll();
        System.out.println( "d: " + d +", " + fifo);

    }

}
