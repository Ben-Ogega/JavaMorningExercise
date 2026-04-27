package com.karacana.exercises;

import java.util.Scanner;

public class MultiplicationTable {
    public static void main(String[] args) {
        int number;
        // int operand;
        System.out.println("Enter an integer to print it's multiplication table: ");
        Scanner scanner = new Scanner(System.in);
        number = scanner.nextInt();
        System.out.println("Multiplication table of " + number  + " is: ");
        for (int operand = 0; operand < 12; operand++) {
            System.out.println(number + " * " + operand + " = " + (number*operand));

        }
    }
}
