package com.karacana.exercises;

import java.util.Arrays;

public class BubbleSort {
    static void bubbleSort(int[] array){
        int size = array.length;
        for (int i = 0; i < size; i++) {
            //compare the elements of the array with a loop
            for (int j = 0; j < size-i-1; j++) {
                // compare two adjacent elements in the array
                if (array[j] > array[j + 1]){
                    // swap if the elements aren't in the right order

                    int temp = array[j];
                    array[j] = array[j + 1];
                    array[j + 1] = temp;
                }

            }
        }
    }
    public static void main(String[] args) {
        int [] data = {5, 3, 4, 1, 2};
        // call the method using class name
        BubbleSort.bubbleSort(data);
        //bubbleSort(data);
        System.out.print("Array sorted with bubble sort: ");
        System.out.println(Arrays.toString(data));
    }
}
