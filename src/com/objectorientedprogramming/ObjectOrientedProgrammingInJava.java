package com.objectorientedprogramming;

public class ObjectOrientedProgrammingInJava {
    public static void main(String[] args) {
       // Create an object of the Vehicle class
        Vehicle vehicle1 = new Vehicle();  //vehicle is an object of Vehicle class
        Vehicle vehicle2 = new Vehicle("Honda","Black", "2012", "Honda", "800");
        System.out.println("The speed is: " + vehicle2.getVehicleSpeed() + "Km/hr");
        vehicle2.setColor("Magenta");
        vehicle1.setColor("Yellow");
        System.out.println("The new color is: " + vehicle1.getColor());
        System.out.println(vehicle2.getVehicle());

        // Create an object of the Car class

        Car car1 = new Car("Honda Civic","Black",
                "2012", "Honda", "800",
                true, false );

        Vehicle vehicle = new Car("Honda Civic","Black",
                "2012", "Honda", "800",
                true, false );

        Vehicle bike = new Bike("Honda Civic","Black",
                "2012", "Honda", "800",
                true );

        System.out.println(car1.isLedScreen());
        System.out.println(car1.getName());
        System.out.println(vehicle.getInfo());
        System.out.println(bike.getInfo());

    }

}
