package com.karacana.exercises;

import java.util.Arrays;
import java.util.Collections;

public class BubbleSortInBuiltMethods {

    public static void main(String[] args) {
       /*
       int [] array = {10, 30, 200, 100, 40, 20, 5, 6,};

        System.out.println("Elements before sorting " + Arrays.toString(array));

        Arrays.parallelSort(array);

        System.out.println("Elements after sorting " + Arrays.toString(array));
*/

        System.out.println("Sorting arrays using the second logic");
        Integer [] array = {10, 30, 200, 100, 40, 20, 5, 6,};

        Arrays.sort(array);

        System.out.println(Arrays.toString(array));

        System.out.println("Sorting arrays using the second logic in reverse order");

        Arrays.sort(array, Collections.reverseOrder());

        System.out.println(Arrays.toString(array));


    }
}
