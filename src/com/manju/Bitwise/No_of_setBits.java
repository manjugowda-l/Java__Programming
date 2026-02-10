package com.manju.Bitwise;

public class No_of_setBits {
    static void main() {
        int n=10;
        System.out.println(Integer.toBinaryString(n));
        System.out.println(setBits(n));

    }
    static int setBits(int n){
        int count =0;
        while(n>0){
            count++;
            n-=(n&-n);
        }
        return count;
    }
}
