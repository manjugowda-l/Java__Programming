package com.manju.Recursion;

public class _1_to_n {
    static void main() {
        print(5);

    }
    static void print(int n){
        if(n==0){

            return ;
        }
        print(n-1);
        System.out.print(n+" ");

    }
}
