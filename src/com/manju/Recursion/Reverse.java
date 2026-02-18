package com.manju.Recursion;

public class Reverse {
    static void main() {
        System.out.println(reverse(1342));

    }
    static int reverse(int n) {
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
