package com.manju.conditionals_loops;

import java.util.Scanner;

public class Factorial {
    static void main() {
        Scanner input=new Scanner(System.in);
        int num;
        System.out.println(factorial(2));
    }
    static int factorial(int num){
        int fact=1;

       for (int i=num;i>0;i--){
           fact=fact*i;
       }
    return fact;
    }
}
