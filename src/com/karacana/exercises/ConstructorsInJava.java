package com.karacana.exercises;

class ConstructorsInJava{
    int modelYear;
    String modelName;

    public ConstructorsInJava(int year, String name) {
        modelYear = year;
        modelName = name;
    }

    public static void main(String[] args) {
        ConstructorsInJava myCar = new ConstructorsInJava(1969, "Mustang");
        System.out.println("My car is a " + myCar.modelYear + " Ford" + myCar.modelName);
    }
}