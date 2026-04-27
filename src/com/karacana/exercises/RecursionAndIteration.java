package com.karacana.exercises;

public class RecursionAndIteration {
    
    public static void main(String[] args) {
	// write your code here
        System.out.println("This is an Iterative walk: ");
        WalkInIteration(5);

        System.out.println("This is a Recursive Walk: ");
        WalkInRecursion(5);

    }
    
    private static void WalkInIteration(int steps){
        for (int i = 0; i < steps; i++) {// this is iteration
            System.out.println( String.format("{%d} is the recursive step ", i));
        }
    }

    private static void WalkInRecursion(int steps){
        // base class
        if (steps < 1) return;
        WalkInRecursion(steps - 1);
        System.out.println("You take a recursive step");

    }

}
