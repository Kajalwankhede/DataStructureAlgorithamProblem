package com.datastructure;
import java.util.Arrays;

public class PrimeAnagramOrPalindrome {
    public String[] isPrime(int range) {
        String[] array = new String[1000];
        int position = 0;
        for(int i = 2; i <= range; i++) {
            boolean isPrime = true;
            for(int j = 2; j <= i / 2; j++) {
                if((i % j) == 0) {
                    isPrime = false;
                    break;
                }
            }
            if(isPrime) {
                array[position] = String.valueOf(i);
                position++;
            }
        }
        String[] returnArray = new String[position];
        for(int k = 0; k < position; k++) {
            returnArray[k] = array[k];
        }
        return returnArray;
    }

    public boolean isPalindrome(String string) {
        if(string.length() < 2) {
            return false;
        }
        char[] array = string.toCharArray();
        int n = array.length;
        for(int i = 0; i < n; i++) {
            if(array[i] != array[n - 1 - i]) {
                return false;
            }
        }
        return true;
    }

    public boolean isAnagram(String string1, String string2) {
        if(string1.length() != string2.length()) {
            return false;
        }
        char[] array1 = string1.toCharArray();
        Arrays.sort(array1);
        char[] array2 = string2.toCharArray();
        Arrays.sort(array2);

        for(int i = 0; i < array1.length; i++) {
            if(array1[i] != array2[i]) {
                return false;
            }
        }
        return true;
    }
    public static void main(String[] args) {
        PrimeAnagramOrPalindrome p=new PrimeAnagramOrPalindrome();
        String[] primeNumbers = p.isPrime(1000);

        System.out.println("Anagram and prime numbers :");
        for(int i = 0; i < primeNumbers.length; i++) {
            for(int j = i + 1; j < primeNumbers.length; j++) {
                if(p.isAnagram(primeNumbers[i], primeNumbers[j])) {
                    System.out.println(primeNumbers[i] + " " + primeNumbers[j]);
                }
            }
        }

        System.out.println("\nPalindrome and prime numbers:");
        for(int i = 0; i < primeNumbers.length; i++) {
            if(p.isPalindrome(primeNumbers[i])) {
                System.out.println(primeNumbers[i]);
            }
        }

    }
}


