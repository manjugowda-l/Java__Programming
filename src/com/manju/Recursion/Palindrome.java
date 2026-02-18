package com.manju.Recursion;

import static com.manju.Recursion.Reverse.helper;

public class Palindrome {
    static void main() {
        System.out.println(palindrome(1342431));

    }
    static boolean palindrome(int n) {
        return n == palind(n);
    }
    static int palind(int n) {
        int digits = (int) Math.log10(n);
        return helper(n, digits);
    }

    static int helper(int n, int digits) {
        if (n % 10==n) {
            return n;
        }
        return (n % 10) * (int) Math.pow(10, digits)
                + helper(n / 10, digits - 1);
    }
}
