package com.manju.basics;

import java.util.Scanner;

public class Currency {
    public static void main(String[] args) {

        Scanner input=new Scanner(System.in);
        float INR= input.nextFloat();
        final int rate=83;
        float USD=INR/rate;
        System.out.printf("%.2f",USD);

    }

}

