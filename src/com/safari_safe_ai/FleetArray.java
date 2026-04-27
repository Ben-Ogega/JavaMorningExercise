package com.safari_safe_ai;

public class FleetArray {
    double[] truckSpeeds = {
        75.5, 82.0, 65.0, 90.1, 70.5, 45.2
    };
    double sum = 0.0;
    public double calculateAverageSpeed() {
        for (double speed : truckSpeeds) {
            sum += speed;
        }
        return sum / truckSpeeds.length;
        
    }
    public static void main(String[] args) {
        FleetArray fleet = new FleetArray();
        double averageSpeed = fleet.calculateAverageSpeed();
        System.out.printf("Fleet Average Speed: %.2f km/h", averageSpeed);
    }
};
