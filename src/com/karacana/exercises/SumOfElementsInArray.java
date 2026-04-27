package com.karacana.exercises;

public class SumOfElementsInArray {
//    public static void main(String[] args) {
//        int num1 = (int)(Math.random() * 100 + 1);
//        System.out.println(num1);

    public static void main(String[] args) {
        int[] array = {5, 2,7,9,6}; // array of size 5.

        int sum = 0;
        for (int i = 0; i < array.length-1; i++) {
            sum = sum + array[i];
        }
        System.out.println( "The sum of " + array.length + " elements in the array is: "+ sum);
    }
}

