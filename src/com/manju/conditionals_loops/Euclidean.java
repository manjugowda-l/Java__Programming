package com.manju.conditionals_loops;

public class Euclidean {
    static void main() {
        System.out.println(gcd(105,224));
    }
    static int gcd(int a,int b){
        if(a==0){
            return b;
        }
        return gcd(b%a,a);
    }
}
