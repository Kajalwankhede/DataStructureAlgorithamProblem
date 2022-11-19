package com.datastructure;

import java.util.Arrays;
public class AnagramOrNot {
    public static void main(String[] args) {
        System.out.println("Checking Two string are anagram or not");
        String str1 = "abcd";
        String str2 = "dcba";
        str1 = str1.toLowerCase();
        str2 = str2.toLowerCase();
        if(str1.length() == str2.length())
        {
            char[] charArray1 = str1.toCharArray();// convert strings to char array
            char[] charArray2 = str2.toCharArray();
            Arrays.sort(charArray1);// sort the char array
            Arrays.sort(charArray2);
            boolean result = Arrays.equals(charArray1, charArray2);// if sorted char arrays are same then the string is anagram
            if(result) {
                System.out.println(str1 + " and " + str2 + " are anagram.");
            }
            else {
                System.out.println(str1 + " and " + str2 + " are not anagram.");
            }
        }
        else {
            System.out.println(str1 + " and " + str2 + " are not anagram.");
        }
    }
}
