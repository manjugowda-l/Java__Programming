package com.manju.Recursion;

public class nto1 {
    static void main() {
        print(5);

    }
    static void print(int n){
        if(n==0){

            return ;
        }
        System.out.print(n+" ");
        print(n-1);
    }
}
