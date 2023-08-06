package com.karacana.exercises;

import java.util.Scanner;

public class CountEvenAndOddDigits {

    /*
    * 1. receive a number from the user
    * 2. create two counters ie evenCount and oddCount
    * 3. Extract the last number by use of modular % operator and check if it
    *       even or odd.
    * */
        public static int  even_count = 0;
        public static int odd_count = 0;
        public static int sumOfEvenNumbers = 0;
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a number with as many integers as possible: ");
        long num = scanner.nextLong();

        while(num > 0)
        {

            int rem = (int) (num % 10);
            if (rem % 2 == 0)
            {
                even_count++;
                sumOfEvenNumbers += rem;
            }
            else
            {
                odd_count++;
            }
            num = num / 10;
        }
        System.out.println("Number of odd numbers are:  " + odd_count);
        System.out.println("Number of even numbers are:  " + even_count);
        System.out.println("The sum of even digits is:  " + sumOfEvenNumbers);

    }
}
