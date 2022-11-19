package com.datastructure;

public class PrimeNumberInRange {
        public static void main(String[] args) {
            System.out.println("To get 1 to 1000 prime numbers:");
            int lower = 0, upper = 1000;
            for (int i = lower; i <= upper; i++)
                if (isPrime (i))
                    System.out.println (i);
        }
        static boolean isPrime (int n)
        {
            int count = 0;
            if (n < 2)   // 0, 1 negative numbers are not prime
                return false;

            for (int i = 2; i < n; i++) // checking the number of divisors between 1 and the number n-1
            {
                if (n % i == 0)
                    return false;
            }
            return true; // if reached here then must be true
        }
    }

