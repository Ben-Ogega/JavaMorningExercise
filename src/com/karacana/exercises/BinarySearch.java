package com.karacana.exercises;

import java.util.Arrays;
import java.util.Scanner;

public class BinarySearch {

    public static void main(String[] args) {
        int[] elements = {10, 20, 30, 40, 50, 60, 70, 80}; // must be in sorted order
        System.out.println("Enter a number to search: ");
        Scanner key1 = new Scanner(System.in);
        int key = key1.nextInt();


        // System.out.println(key);

        int lowerBound = 0;
        int higherBound = elements.length - 1;
        boolean flag = false;
        while (lowerBound <= higherBound) {
            int mid = (lowerBound + higherBound) / 2;

            if (elements[mid] == key) {
                System.out.printf("Element %s found at position: \n", key);
                flag = true;
                break;
            }

            if (elements[mid] < key)
            {
                lowerBound = mid + 1;
            }

            if (elements[mid] > key)
                higherBound = mid - 1;
        }

        if (!flag) {
            System.out.println("Element not found:");

        }

        // using the built-in binary search method

        System.out.println("Using the built in function: ");
        System.out.println(Arrays.binarySearch(elements, 50));



    }
}

