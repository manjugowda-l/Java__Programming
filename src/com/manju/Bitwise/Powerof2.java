package com.manju.Bitwise;

public class Powerof2 {
    static void main() {
        int n=0;
        boolean ans=(n&(n-1))==0;
        System.out.println(ans);

    }
}
