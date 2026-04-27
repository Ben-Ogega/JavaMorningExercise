package com.karacana.princetonuniversity;

import java.util.Scanner;

/*
* Logic
* Accept two int values from the command line and convert them to polar using the
* Math.arctan method in the (r, theta) using tan = y/x
* */
public class CartesianToPolar {

    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in)) {
            System.out.println("Enter the Y coordinate: ");
            double y = scanner.nextDouble();

            System.out.println("Enter the X coordinate: ");
            double x = scanner.nextDouble();
            double theta = Math.atan2(y, x);
            // compute r for radius r^2 = y^2 + x^2
            double r = Math.sqrt(Math.pow(y, 2) + Math.pow(x, 2));

            System.out.format("The polar coordinates of %1.0f and %1.0f are [%.2f, %.2f Rads]", y, x,
                    r, theta);
        }
         catch (Exception e) {
            System.err.println("Error: Invalid input. Please enter valid numeric coordinates.");
            System.err.println("Details: " + e.getMessage());
        }
    }
}
