package com.karacana.exercises;

import java.util.Scanner;

public class ReverseANumber {
    public static void main(String[] args) {

        System.out.println("Enter a number: ");
        Scanner scanner = new Scanner(System.in);
        int number = scanner.nextInt();
        // Method 1 using An algorithm.
        /*
        * 1. Use of Modulus and division operators
        * 2. ie 1234 % 10 gives 4
        * 3. 1234 / 10 gives 123
        * 4. using while loop
        * */
        int reversed = 0;

        while (number != 0)
        {
            reversed = reversed *10 + number % 10;
           number = number / 10;

        }

        System.out.format("The number in reverse is %.6f", (float)(reversed));
    }

}
