package ua.com.kneu.groupe_201.example1;

import java.util.LinkedList;
import java.util.Queue;

public class MyFiFo {

    public static void main(String[] args) {

        Queue<Integer> queue = new LinkedList<>();
        queue.add(1);
        queue.add(2);
        queue.add(3);

        System.out.println(queue.peek());
        System.out.println(queue);


        System.out.println(queue.poll());
        System.out.println(queue);




    }


}
