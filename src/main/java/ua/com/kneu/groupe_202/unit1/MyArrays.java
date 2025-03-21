package ua.com.kneu.groupe_202.unit1;

import java.util.Arrays;

public class MyArrays {

    // psvm + [Tab]
    public static void main(String[] args) {

        int[] arr = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};

        int[] arr2 = new int[5];

        arr2[0] = 0;
        arr2[1] = 1;
        arr2[2] = 2;
        arr2[3] = 3;
        arr2[4] = 4;

        System.out.println(Arrays.toString(arr));

        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);
        }

        int[][] arr3 = {
                {1, 2, 3},
                {4, 5, 6},
                {7, 8, 9}
                };

        for (int i = 0; i < arr3.length; i++) {
            System.out.println(Arrays.toString(arr3[i]));
        }

        for (int i = 0; i < arr3.length; i++) {
            for (int j = 0; j < arr3[i].length; j++) {
                System.out.print(arr3[i][j]+", ");
            }
            System.out.println();
        }


    }


}
