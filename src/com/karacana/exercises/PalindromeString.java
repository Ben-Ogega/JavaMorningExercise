package com.karacana.exercises;

import java.util.Scanner;
import java.util.concurrent.atomic.AtomicReference;

public class PalindromeString {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a string ");
        AtomicReference<String> string = new AtomicReference<>(scanner.next());

        /* Method 1 using an Algorithm */
        StringBuilder reversedString = new StringBuilder();
        int len = string.get().length();
        for(int i = len-1; i >=0; i--){
            reversedString.append(string.get().charAt(i));
        }
        if (string.equals(reversedString.toString())) {
            System.out.println("This is a palindrome string");
        } else
            System.out.println("This is not a palindrome string");
    }

}
