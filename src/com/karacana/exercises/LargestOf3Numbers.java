package com.karacana.exercises;

import java.util.Scanner;

public class LargestOf3Numbers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the first number: ");
        int a = scanner.nextInt();

        System.out.println("Enter the first number: ");
        int b = scanner.nextInt();

        System.out.println("Enter the first number: ");
        int c = scanner.nextInt();

        //Approach 1
        if (a > b && a > c)
        {
            System.out.format(a + " Is the largest number of %d and %d", b, c);
        }
        else if (b > a && b > c)
        {
            System.out.format(b + " Is the largest number of %d and %d", a, c);
        }
        else
            System.out.format(c + " Is the largest of %d and %d", a, b);
    }
}
