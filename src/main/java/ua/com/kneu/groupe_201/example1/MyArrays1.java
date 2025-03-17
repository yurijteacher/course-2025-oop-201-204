package ua.com.kneu.groupe_201.example1;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Random;

public class MyArrays1 {

    // psvm + [Tab]
    public static void main(String[] args) {

        int[] arr = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};

        int[] arr2 = new int[5];

        arr2[0] = 1;
        arr2[1] = 2;
        arr2[2] = 3;
        arr2[3] = 4;
        arr2[4] = 5;

        // sout
        System.out.println(arr);

        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);
        }

        System.out.println(Arrays.toString(arr));

        int[][] arr3 = {
                        {1, 2, 3},
                        {4, 5, 6},
                        {7, 8, 9}
                        };

        int[][] arr4 = new int[5][5];

        for (int i = 0; i < arr4.length; i++) {
            for (int j = 0; j < arr4[i].length; j++) {
                arr4[i][j] = new Random().nextInt(10);
            }
        }

        for (int i = 0; i < arr4.length; i++) {
            for (int j = 0; j < arr4[i].length; j++) {
                System.out.print(arr4[i][j] + " ");
            }
            System.out.println();
        }

        for (int i = 0; i < arr4.length; i++) {
            System.out.println(Arrays.toString(arr4[i]));
        }

        List<Integer> arr5 = List.of(1,2,3,4);
        System.out.println(arr5);




    }




}
