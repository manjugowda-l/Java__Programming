package com.manju.Recursion;

public class sum_of_nto1 {
    static void main() {
        System.out.println(sum(5));

    }
    static int sum(int n){
        if(n<=1){
            return 1;
        }
        return (n+sum(n-1));


    }

}
