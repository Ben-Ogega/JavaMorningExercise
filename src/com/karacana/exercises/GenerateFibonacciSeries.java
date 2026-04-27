package com.karacana.exercises;

public class GenerateFibonacciSeries {
/*Using for loops. the Big O is O(n) for both
    space complexity and time complexity

    we can also use Memoization ie recursion.
    */
    public static void main(String[] args) {
        int n1 = 0, n2 = 1, sum;
        System.out.print(n1 + " "+ n2);

        for (int i = 2; i < 10 ; i++) {
            sum = n1 + n2;
            n1 = n2;
            n2 = sum;

            System.out.format(" " + sum);
        }
    }
}
