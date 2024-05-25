package com.shantanu;

public class Reverse {
    public static void main(String[] args) {
        String str = "Shantanu";
        String reversed = reverseString(str);
        System.out.println("Original string: "+ str);
        System.out.println("Reversed string: "+ reversed);

    }
    private static String reverseString(String str) {
        char[] charArray = str.toCharArray();
        int start = 0;
        int end = charArray.length - 1;
        while (start < end) {
            char temp = charArray[start];
            charArray[start] = charArray[end];
            charArray[end] = temp;
            start++;
            end--;

        }
        return new String(charArray);

    }
}
