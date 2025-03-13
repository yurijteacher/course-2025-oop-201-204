package ua.com.kneu.groupe_202;

import java.util.Stack;

public class MyLiFo {

    public static void main(String[] args) {

        Stack<Integer> stack = new Stack<>();
        stack.push(1);
        stack.push(2);
        stack.push(3);

        stack.peek();
        System.out.println(stack);

        stack.pop();
        System.out.println(stack);
        
    }


}
