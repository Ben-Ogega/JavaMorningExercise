package com.safari_safe_ai;
// To learn about loops(for, while, do-while) and arrays in Java, we will create a simple RPM (Revolutions Per Minute) counter for a vehicle. The RPM counter will simulate the engine's revolutions and calculate the average RPM over a certain period.
public class RPMCounter {
    public static void main(String[] args) {
      System.out.println("Initiating Engine Warm-up...");
        for (int rpm = 800; rpm <= 2500; rpm += 200) {
            System.out.println("Engine RPM: " + rpm);
        }
        System.out.println("Optimal operating temperature reached.");
    }
    
    }

