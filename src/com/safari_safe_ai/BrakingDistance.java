package com.safari_safe_ai;
/*
Goal: Writing reusable functions.
Concept: The physics of d = v^2 / 2mu.g.
*/
public class BrakingDistance {

    public static void main(String[] args) {
        double speedMs = 22.22; // 80 km/h in m/s
        double distance = calculateDistance(speedMs, 0.7);
        System.out.println("Estimated Braking Distance: " + distance + " meters");
    }

    public static double calculateDistance(double velocity, double mu) {
        return (Math.pow(velocity, 2)) / (2 * mu * 9.81);
    }
}
