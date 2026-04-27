package com.karacana.exercises;

public class EvenOddFromArray {

    public static void main(String[] args) {
        int[] array = { 1, 2, 3, 4, 5, 6,7,8};

        // Extracting even numbers.......
        for (int j : array) {
            if (j % 2 == 0)
                System.out.print(j +" ");
        }
        System.out.println(" ");
        System.out.println("Printing Odd numbers");
        // Extracting odd numbers.......
        for (int j : array) {
            if (j % 2 != 0)
                System.out.print(j +" ");
        }
       
    }
}
