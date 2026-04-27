package com.karacana.exercises;

public class SwappingInJava {

    public static void main(String[] args) {
        int a = 30;
        int b = 20;
        System.out.println("Before swapping the values of a and b are " + a + " and " + b);
        a = a ^  b;
        b = a ^ b;
        a = a ^ b;
        System.out.println("After swapping using the XOR Bitwise Operator" +
                " the values are " + a + " and " + b);
        a = a + b - (a=b);
        System.out.println("After swapping using the one line method" +
                " the values are " + a + " and " + b);
    }
}
