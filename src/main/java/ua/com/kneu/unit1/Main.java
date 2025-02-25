package ua.com.kneu.unit1;

import java.util.Date;
import java.util.stream.Stream;

public class Main {

    public static void main(String[] args) {
//        System.out.println("Hello World!");

        byte x1 = 120;
        short x2 = 240;
        int x3 = 320;
        long x4 = 40000L;

        float x5 = 123.4f;
        double x6 = 123.4;

        char x7 = 'a';
        boolean x8 = true;

        String text = "Hello World!";
        System.out.println(text);
        System.out.println(text.hashCode());
        text = text + "! ";
        System.out.println(text.hashCode());

        System.out.println(x1 + ", " + x2 + ", " + x3 + ", " + x4 + ", " + x5);

        char[] array = text.toCharArray();
        String text2 = new String(array);

        Date date = new Date();
        System.out.println(date);

        // for
        for (int i = 0; i < 10; i++) {
            System.out.println(i);
        }

        int i = 0;
        for (;i<12;) {
            System.out.println(i);
            i++;
        }

        i=0;

        // while
        while (i<24){
            System.out.println(i);
            i++;
        }

//        for (;;) {
//            System.out.println("Hello World!");
//        }

        // do-while
        i = 0;
        do {
            System.out.println(i);
            i++;
        } while (i<50);

        if(i>18){
            System.out.println("Age > 18");
        } else {
            System.out.println("Age < 18");
        }

        int age = 18;

        int[] array2 = {1,2,3,4,5,6,7,8,9};

        for (int j = 0; j <= array2.length; j++) {
            System.out.println(j);
        }

        int j = 0;
        while (j<=array2.length){
            System.out.println(j);
            j++;
        }

        j=0;
        do {
            System.out.println(j);
            j++;
        } while (j<=array2.length);

        Stream
              .of(array2)
              .forEach(System.out::println);

        for (int el : array2){
            System.out.println("el: " + el);
        }













    }

}
