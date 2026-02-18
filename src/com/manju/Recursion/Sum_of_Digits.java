package com.manju.Recursion;

public class Sum_of_Digits {
    static void main() {
        System.out.println(sumOfDigits(1342));

    }
    static int sumOfDigits(int n){
        if(n==0){
            return 0;
        }
        return (n % 10) + sumOfDigits(n / 10);


    }
}
