package com.karacana.exercises;

public class RemoveJunk {
    public static void main(String[] args) {
        String str = "&#@^*&()%$#@?|}{}+_ Latin String 01234567890";

        String str1 = str.replaceAll("[^a-zA-Z0-9]", " ");
        System.out.println(str1.strip());
    }
}
