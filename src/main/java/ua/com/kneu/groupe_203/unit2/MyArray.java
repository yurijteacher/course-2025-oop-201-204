package ua.com.kneu.groupe_203.unit2;

import java.util.Arrays;

public class MyArray {
    // psvm + [Tab]
    public static void main(String[] args) {

        int[] array = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        int[] array2 = new int[5];

        array2[0] = 0;
        array2[1] = 1;
        array2[2] = 2;
        array2[3] = 3;
        array2[4] = 4;

        for (int i = 0; i < array.length; i++) {
            // sout + [Tab]
            System.out.println(array[i]);
        }

        System.out.println(array2);

        System.out.println(Arrays.toString(array));

        Arrays.stream(array2).forEach(System.out::println);


        int[][] arrays = {  {1, 2, 3},
                            {4, 5, 6},
                            {7, 8, 9} };

        int[][] arrays2 = new int[5][5];

        arrays2[0][0] = 1;
        arrays2[0][1] = 2;
        arrays2[0][2] = 3;
        arrays2[0][3] = 4;
        arrays2[0][4] = 5;

        arrays2[1][0] = 6;
        arrays2[1][1] = 7;
        arrays2[1][2] = 8;
        arrays2[1][3] = 9;
        arrays2[1][4] = 10;

        arrays2[2][0] =11;
        arrays2[2][1] = 12;
        arrays2[2][2] = 13;
        arrays2[2][3] = 14;
        arrays2[2][4] = 15;

        for (int i = 0; i < arrays.length; i++) {
            for (int j = 0; j < arrays[i].length; j++) {
                System.out.print(arrays[i][j] + ", ");
            }
            System.out.println();
        }

        for (int i = 0; i < arrays.length; i++) {
            System.out.println(Arrays.toString(arrays[i]));
        }





    }


}
