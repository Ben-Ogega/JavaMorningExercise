package com.karacana.exercises;

public class MaxAndMinElementsInArray
{
    public static void main(String[] args) {
        int [] array = {50, 30, 40, 20, 10,  60, 100};

        int max = array[0];

        for (int i : array) {
            if (i > max) {
                max = i;
            }
            //System.out.println();
        }
        System.out.println("The maximum element is: "+ max);

        System.out.println();
        System.out.println("The minimum element:");
        int min = array[0];
        for (int j : array) {
            if (j <= min) {
                min = j;
            }
            //System.out.println();
        }
        System.out.println("The minimum element is: "+ min);
    }
}
