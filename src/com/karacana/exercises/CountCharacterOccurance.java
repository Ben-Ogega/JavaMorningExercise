package com.karacana.exercises;

public class CountCharacterOccurance {
    public static void main(String[] args) {
        String str = "Java is a good good good programming " +
                "language for OOP";
        int  totalCount = str.length(); // total len of Str

        int totalCountAfterRemove = str.replace("J", "").length();

        int count = totalCount - totalCountAfterRemove;

        System.out.println("Number of occurrences of 'j' is: " + count);

    }

}
