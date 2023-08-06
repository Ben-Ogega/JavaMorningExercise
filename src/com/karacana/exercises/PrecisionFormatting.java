package com.karacana.exercises;

import java.util.Scanner;

public class PrecisionFormatting {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a first floating a point number: ");
        float a = scanner.nextFloat();

        System.out.println("Enter a second floating point number: ");
        float b = scanner.nextFloat();

        System.out.format("%4.3f", a/b);
    }
}
