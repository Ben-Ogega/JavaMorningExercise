package com.safari_safe_ai;

import java.util.Scanner;

public class VehicleTelemetry {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter Vehicle Model: ");
        String model = scanner.nextLine();

        System.out.print("Enter Current Speed (km/h): ");
        double speed = scanner.nextDouble();

        System.out.println("\n--- Telemetry Report ---");
        System.out.println("Status: Monitoring " + model);
        System.out.println("Current Velocity: " + speed + " km/h");
        
        scanner.close();
    }
}