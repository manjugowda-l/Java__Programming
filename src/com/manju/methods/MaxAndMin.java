package com.manju.methods;

import java.util.Scanner;

//Define two methods to print the maximum and the minimum
// number respectively among three numbers entered by the user.
public class MaxAndMin {
    static void main() {
        Scanner input =new Scanner(System.in);
        int num1= input.nextInt();
        int num2= input.nextInt();
        int num3= input.nextInt();
        System.out.println(max(num1,num2,num3));
        System.out.println(min(num1,num2,num3));
    }
    static int max(int num1,int num2,int num3){
        int Max=Math.max(num1,Math.max(num2,num3));
        return Max;
    }
    static int min(int num1,int num2,int num3){
        int Min=Math.min(num1,Math.min(num2,num3));
        return Min;
    }


}
