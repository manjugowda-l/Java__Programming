package com.manju.basics;

import java.util.Scanner;

public class LargestNumber {
    public static void main(String[] args){
        Scanner input=new Scanner(System.in);
        float num1=input.nextFloat();
        float num2=input.nextFloat();
        if(num1==num2){
            System.out.println("Equal");
        }else {
            System.out.println(largest(num1, num2));
        }
    }
    static float largest(float num1,float num2){
        float result =0;
         if (num1>num2){
             result=num1;
         }else {
             result=num2;

         }
    return result;
    }
}
