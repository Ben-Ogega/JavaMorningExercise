package com.karacana.princetonuniversity;

import java.util.Scanner;

public class  DayOfWeek {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter month number: ");
        int m = scanner.nextInt();
        System.out.println("Enter day number: ");
        int d = scanner.nextInt();
        System.out.println("Enter year number: ");
        int y = scanner.nextInt();

        int y_0 = y - (14 - m) / 12;
        int x = y_0 + y_0/4 - y_0/100 + y_0/400;
        int month_of_the_year = m + 12 * ((14 - m) / 12) - 2;
        int day_of_the_week = (d + x + (31*month_of_the_year)/12) % 7;

        switch (day_of_the_week) {
            case 0 -> System.out.println("Sunday");
            case 1 -> System.out.println("Monday");
            case 2 -> System.out.println("Tuesday");
            case 3 -> System.out.println("Wednesday");
            case 4 -> System.out.println("Thursday");
            case 5 -> System.out.println("Friday");
            case 6 -> System.out.println("Saturday");
            default -> System.out.println("Your calculations are wrong: ");

        }
        System.out.println("You were born on the " +  day_of_the_week + " day of the " +
                m + " month of the year " + y);
    }

}