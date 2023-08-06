package com.karacana.exercises;

import java.util.Scanner;

public class PalindromeNumber {

    public static void main(String[] args) {
        System.out.println("Enter a number: ");
        Scanner scanner = new Scanner(System.in);
        int num = scanner.nextInt();
        int originalNumber = num;
        int reversedNumber = 0;
        int count = 3;


        while (num != 0)
        {
         reversedNumber = reversedNumber * 10 + num % 10;
         num /= 10;
        }

        if (originalNumber == reversedNumber)
        {
            System.out.format("%d Is a palindrome \n", originalNumber);
        }

        else
        {
            System.out.format("%d Is not a palindrome \n", originalNumber);
        }
    }
}