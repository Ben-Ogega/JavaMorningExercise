package com.karacana.exercises;

public class FindingMissingValues {
    /*
     * array need not be sorted
     * array need not have duplicates
     * values should be in range
     * */
    public static void main(String[] args) {
        int[] a = {1, 2, 3, 4, 5, 7, 8, 9, 10};
        int sum1 = 0;
        // 1-2-4-5 =12 sum1
        // 1+2+3+4+5 = 15 sum2
        // sum2 - sum1 = 15 -12 =3 missing number

        for (int k : a) {
            sum1 += k;

        }
        System.out.println("The sum of all values  from 1 to " + a.length + " is: " + sum1);

        int sum2 = 0;
        for (int j = 0; j <= 10; j++)
            sum2 += j;
        System.out.println("The sum of all values  from 1 to 5 is: " + sum2);
        System.out.println("So the missing value is " + (sum2 - sum1));
}

}


