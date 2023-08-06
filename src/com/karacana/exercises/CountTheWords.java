/*
* Author: Ben Ogega
* Country: Kenya
* Version: 0.0.1
*
* This program counts the number of occurences in a given string
* It receives input from the user.
*
* */

package com.karacana.exercises;

import java.util.Scanner;

public class CountTheWords {

    public static void main(String[] args) {
        System.out.println("Enter the string: ");

        Scanner scanner = new Scanner(System.in); // scanner object

        String string = scanner.nextLine();
        // and extract the string. The space is also taken as a word.
        int count = 1;
        for (int i = 0; i < string.length() - 1; i++) {
            if (string.charAt(i) == ' '  && string.charAt(i+1) != ' ')
            {
                count ++;
            }
        }

        System.out.format("The are %s number of words in the " +
                "string you have just entered  ", count);



    }
}
