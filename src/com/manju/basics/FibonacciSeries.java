package com.manju.basics;

import java.util.Scanner;

public class FibonacciSeries {
    static void main() {
        Scanner input =new Scanner(System.in);
        int n= input.nextInt();
        int a=0;
        System.out.print(a);
        int b=1;
        System.out.print(" "+b);
        for(int i=2;i<=n;i++){
            int temp=b;
            b=a+b;
            a=temp;
            System.out.print(" "+ b);
        }
    }
}
