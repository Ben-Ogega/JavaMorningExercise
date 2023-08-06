package com.karacana.exercises;

public class Harmonic {
    public static double harmonic(int n)
    {
        double sum = 0.0;
        for (int i = 1; i <= n; i++) {
            sum += 1.0/i;
        }
        return sum;
    }

    public static void main(String[] args) {
        for (String s : args) {

            int arg = Integer.parseInt(s);

            double value = harmonic(arg);
            System.out.format("%f", value);

        }
    }
}

