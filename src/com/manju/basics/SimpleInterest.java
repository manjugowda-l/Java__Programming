package com.manju.basics;

import java.util.Scanner;

public class SimpleInterest {
    public static void main(String[] args)
    {
        Scanner input=new Scanner(System.in);
        float P= input.nextFloat();
        float T= input.nextFloat();
        float R= input.nextFloat();
        float SimpleInterest=(P*T*R)/100;
        System.out.println(SimpleInterest);


    }
}
