package com.manju.Bitwise;

public class EvenOROdd {
    static void main() {
       int n=68;
        System.out.println(isOdd(n));
    }
    static boolean isOdd(int n){
        return (n&1)==1;
    }

}
