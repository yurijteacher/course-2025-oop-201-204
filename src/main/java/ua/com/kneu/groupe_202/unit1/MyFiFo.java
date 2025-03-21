package ua.com.kneu.groupe_202.unit1;

import java.util.LinkedList;
import java.util.Queue;

public class MyFiFo {

    public static void main(String[] args) {

        Queue<Integer> queue = new LinkedList<>();
        queue.add(1);
        queue.add(2);
        queue.add(3);

        queue.peek();
        System.out.println(queue);

        int a = queue.poll();
        System.out.println("a: " +a +";" + queue);


    }



}
