package com.objectorientedprogramming;

import java.util.Objects;

public class Vehicle {
    private String name = " ";
    private String color = "";
    private String model = " ";
    private String company = " ";
    private String engine = "";
    public static int count = 0;

    public Vehicle() {// an empty constructor
        count++;
    }

    public Vehicle(String name, String color, String model, String company, String engine) {
        this.name = name;
        this.color = color;
        this.model = model;
        this.company = company;
        this.engine = engine;
        count++;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public String getCompany() {
        return company;
    }

    public void setCompany(String company) {
        this.company = company;
    }


    private String getEngine() {
        return engine;
    }

    public void setEngine(String engine) {
        this.engine = engine;
    }

    public int getVehicleSpeed(){
        String capacity = getEngine();
        if (Objects.equals(capacity, "800")){
            return 90;
        }
        else return 120;
    }

    public static String getVehicle(){
        return "This is a static method";
    }


    public String getInfo() {
        return "This is a vehicle";
    }
}
