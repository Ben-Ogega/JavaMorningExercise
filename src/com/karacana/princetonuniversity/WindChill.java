/*
* Logic :
* National Weather Service defines chill defines the wind to be:
*   w = 35.74 + 0.6215t + (0.4275t - 35.75)v^0.16
*
* Get t(time) and v(wind speed in miles/hour) from the user
* Use the Math library
* */

package com.karacana.princetonuniversity;


import java.util.Scanner;

public class WindChill {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        // get the temperature in Fahrenheit
        System.out.print("What is the temperature in Fahrenheit? ");
        double t = scanner.nextDouble();
        // get the speed
        System.out.print("What is the wind speed in Miles/hr? ");
        double v = scanner.nextDouble();

        double wind_chill = (35.74 + 0.6215) * t + (0.4275 * t -35.75)* Math.pow(v, 0.16);

        System.out.println("The wind chill is " + wind_chill);

    }
}
