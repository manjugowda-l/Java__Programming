package com.manju.Bitwise;

public class NoofDigits {
    static void main() {
        int n=34567;
        int b=10;
        int ans=(int)(Math.log(n)/Math.log(b))+1;
        System.out.println(ans);
    }
}
