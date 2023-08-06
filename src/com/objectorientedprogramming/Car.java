package com.objectorientedprogramming;

public class Car extends Vehicle{
    private boolean powerSteering = false;
    private boolean ledScreen = true;

    public Car(String name, String color, String model, String company,
               String engine, boolean powerSteering, boolean ledScreen) {
        super(name, color, model, company, engine);
        this.powerSteering = powerSteering;
        this.ledScreen = ledScreen;
    }

    public boolean isPowerSteering() {
        return powerSteering;
    }

    public void setPowerSteering(boolean powerSteering) {
        this.powerSteering = powerSteering;
    }

    public boolean isLedScreen() {
        return ledScreen;
    }

    public void setLedScreen(boolean ledScreen) {
        this.ledScreen = ledScreen;
    }

    // @Override
    public String getName() {
        return "The name of your car is: " + super.getName();
    }

    public String getInfo() {
        return "This is a car";
    }
}
