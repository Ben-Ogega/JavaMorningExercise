package com.karacana.exercises;

import java.util.Scanner;

public class CountingNumberOfDigits {

/*
 Logic 1.
 1. accept a number from the user
 2. Use division to get the remainder
 3.Set the counter and increase it by 1 every time a remainder is achieved
 4. Use While loop
* */

    public static void main(String[] args) {

        System.out.println("Enter any number: ");
        Scanner scanner = new Scanner(System.in);
        int orig_num = scanner.nextInt();
        int num = orig_num;
        int count = 0;
        //int num = 0;

        while(num > 0){
            num = num/10;
            count++;
        }
        System.out.format("There are %s digits in %d: ",count, orig_num );
    }
}
