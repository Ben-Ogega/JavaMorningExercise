/*
* A natural number is any number greater than 1
* A prime number is a natural number that has only 2 factors. 1 and itself
* 19 => 1 and 19 => prime number
* 28 => 1, 2, 4, 7, 14, 28 => is not a prime number
* */

package com.karacana.exercises;

import java.util.Scanner;

public class CheckForPrimeNumbers {
    public static void main(String[] args) {
        // create two variables;
        System.out.println("Enter a number: ");
        Scanner scanner = new Scanner(System.in);
        int num = scanner.nextInt();
        boolean flag = false;
        for (int i = 2; i <= num / 2; ++i) {
            // condition for non prime number
            if (num % i == 0) {
                flag = true;
                break;
            }
        }
        if (!flag)
            System.out.println(num + " is a prime number.");
        else
            System.out.println(num + " is not a prime number.");
            }
        }


