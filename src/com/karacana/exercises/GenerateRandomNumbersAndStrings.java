package com.karacana.exercises;

import net.bytebuddy.utility.RandomString;

import java.util.Random;

// Logic 1: random numbers using Random class
// Logic 2: random numbers using Math class
// Logic 1: random numbers using Apache Common class API
public class GenerateRandomNumbersAndStrings {

    public static void main(String[] args) {

        // create a random object from the built-in Random class
        Random random = new Random();

        int rand_int =  random.nextInt(100);
        System.out.println(rand_int);

        // Logic 2: random numbers using Math clas
        double rand_int2 = Math.random();
        System.out.println(rand_int2);

        // Logic 2: random numbers using Apache API
        RandomString randomString = new RandomString(5);
        String  randomString2 = randomString.nextString();
        System.out.format("Your name is: %s:001 ",
                randomString2);
    }

}
