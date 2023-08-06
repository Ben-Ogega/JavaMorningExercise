package com.karacana.exercises;

public class InsertionSort {

    void sortArray(int[] arr){
        int n = arr.length;
        for (int i = 0; i < n; i++) {
            int current = arr[i];
            int j = i - 1;
            while(j >= 0 && arr[j] > current){
            arr[j +1] = arr[j];
            j = j-1;
        }
            arr[j + 1] = current;
    }
}
// @Contract(pure = true)
static void printArray(int[] arr){
    for (int j : arr) {
        System.out.print(j + " ");
        // System.out.println();

    }
    }

    public static void main(String[] args) {
        int [] arr = {7, 3, 6, 8, 2, 1, 9, 5};
        var arrayOfNumbers = new InsertionSort();
        arrayOfNumbers.sortArray(arr);
        printArray(arr);
    }
}
