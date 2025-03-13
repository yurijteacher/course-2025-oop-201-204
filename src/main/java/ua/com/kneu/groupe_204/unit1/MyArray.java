package ua.com.kneu.groupe_204.unit1;

import java.util.Arrays;

public class MyArray {

    public static void main(String[] args) {
        System.out.println("Hello World!");

        int[] array = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};

        int[] array2 = new int[10];

        array2[0] = 1;
        array2[1] = 2;
        array2[2] = 3;
        array2[3] = 4;
        array2[4] = 5;
        array2[5] = 6;
        array2[6] = 7;
        array2[7] = 8;
        array2[8] = 9;
        array2[9] = 10;
      //  array2[10] = 11;

        System.out.println(array);

        for (int i = 0; i < array.length; i++) {
            System.out.println(array[i]);
        }

        System.out.println(Arrays.toString(array2));

        int[][] array3 = {{1, 2, 3}, {4, 5, 6}, {7, 8, 9}};

        for (int i = 0; i < array3.length; i++) {
            for (int j = 0; j < array3[i].length; j++) {
                System.out.print(array3[i][j] + ", ");
            }
            System.out.println();
        }


        for (int i = 0; i < array3.length; i++) {
            System.out.println(Arrays.toString(array3[i]));
        }

    }


}
