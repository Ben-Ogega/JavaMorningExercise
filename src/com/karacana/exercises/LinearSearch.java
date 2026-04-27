package com.karacana.exercises;

public class LinearSearch {
    public static void main(String[] args) {
        int[] array = {10, 20, 30, 40, 50, 30};
        int search_elem = 100;
        boolean flag = false;
        for (int i = 0; i < array.length; i++) {
            if (search_elem == array[i]) {
                System.out.println("Element found at: " + i);
                flag = true;
                break;
            }
        }
        if (!flag)
            System.out.println("Element not found: ");
    }

}
