package com.manju.conditionals_loops;

import java.util.Scanner;

public class Factors {
    static void main() {
        Scanner input= new Scanner(System.in);
        int num=input.nextInt();
        factors(num);
    }
    static void factors(int num){
        for(int i=1;i<=num;i++){
            if(num%i==0){
                System.out.print(" " +i);
            }
        }
    }
}
