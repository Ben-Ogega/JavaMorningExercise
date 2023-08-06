package com.karacana.exercises;

import java.util.Arrays;

public class BubbleSortLogic {
    public static void main(String[] args) {
        int [] array = {4, 2, 1, 5, 3};
        System.out.println("Arrays before sorting: " + Arrays.toString(array));

        int n = array.length; // number of passes

        for (int i = 0; i < n -1; i++) {

            for (int j = 0; j < n-1; j++)
            {
                if (array[j] > array[j + 1])
                {
                    int temp = array[j];
                    array[j] = array[j + 1];

                    array[j+ 1] = temp;

                }
            }

        }
        System.out.println("Array after sorting: ");
        System.out.println(Arrays.toString(array));
    }
}
