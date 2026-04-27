package com.safari_safe_ai;

public class FrictionBudget {
    public static void main(String[] args) {
        double currentGForce = 0.85; // Simulate Sensor Example G-force value
        double limitGForce = 0.8; // Maximum G-force before losing traction

    if (currentGForce > limitGForce) {
        System.out.println("WARNING: Friction budget exceeded! Reduce speed or adjust driving.");
    } else {
        System.out.println("✅ STATUS: Friction budget within limits. Continue driving safely.");
    }   
}
}
