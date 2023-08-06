package com.karacana.exercises;

public class ReverseAString {

    public static void main(String[] args) {
        System.out.println("#----Use of an algorithm---------#");
        System.out.println("#------------------------------------------------#");
        String string = "ABCDE";
        // Method 1 using an Algorithm
         StringBuilder reversedString = new StringBuilder();
        int len = string.length();
        for(int i = len-1; i >=0; i--){
            reversedString.append(string.charAt(i));
        }
        System.out.format("The reversed string %s in uppercase  becomes %s" +
                " in lowercase and then reversed as " +
                "%s \n", string,string.toLowerCase(), reversedString);

        /* 2. Method 2
        reverse A string using character array.

        * Use To CharArray to convert string to an array
        * */
        System.out.println("#------------------------------------------------#");
        System.out.println("Using toCharArray method to reverse a string");
        char[] array = string.toCharArray();
        int len2 = array.length;

        for (int i = len2 - 1; i == 0 ; i--) {
            String reversedString2 = " ";
            reversedString2.charAt(i);
        }
        System.out.format("The reversed string %s in uppercase  becomes %s " +
            " in lowercase and then reversed as " +
         " %s \n", string, string.toLowerCase(), reversedString);

        /* Method 2.
        * Using string buffer class
        * */
        System.out.println("#------------------------------------------------#");
        System.out.println("Using toCharArray method to reverse a string");
        StringBuffer stringBuffer = new StringBuffer(string);
         StringBuffer reversed =  stringBuffer.reverse();
        System.out.println(reversed);
    }


}
