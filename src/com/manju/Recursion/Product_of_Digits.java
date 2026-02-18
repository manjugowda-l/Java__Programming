package com.manju.Recursion;

public class Product_of_Digits {
    static void main() {
        System.out.println(productOfDigits(1342));

    }
    static int productOfDigits(int n){
        if(n%10==n){
            return n;
        }
        return ((n % 10) * productOfDigits(n / 10));


    }
}

