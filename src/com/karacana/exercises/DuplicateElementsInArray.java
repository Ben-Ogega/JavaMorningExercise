package com.karacana.exercises;

import java.util.HashSet;

public class DuplicateElementsInArray {

    public static void main(String[] args) {

        // logic 1 loop using HashSet.
        String [] languages = {"Java", "C", "C++", "Python", "Java"};

        HashSet <String> langs = new HashSet<>();

        boolean flag = false;

        for (String language : languages) {
            if (!langs.add(language)) {
                System.out.println("Found Duplicate element: " + language);
                flag = true;
            }
        }

        if (!flag)
            System.out.println("Duplicates not found");
    }


}
        // logic 2 loop through the array picking the element you need to compare.
        /* boolean flag = false;
        for (int i = 0; i < languages.length; i++) {

            for (int j = i+1; j < languages.length; j++) {

                if (languages[i].equals(languages[j])) {
                    System.out.println("Duplicates found: " + languages[i]);
                    flag = true;
                }
            }
        }*/
