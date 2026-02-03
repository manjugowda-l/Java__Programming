package com.manju.conditionals_loops;


import java.util.Scanner;

public class SumTillXero {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int sum = 0;
        int num;

        while (true) {
            num = input.nextInt();

            if (num == 0) {
                break;
            }

            sum = sum + num;
        }

        System.out.println("Sum = " + sum);
    }
}
