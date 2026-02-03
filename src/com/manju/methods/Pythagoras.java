package com.manju.methods;

import java.util.Scanner;

public class Pythagoras {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();

        System.out.println(isPythagorasTriplet(a, b, c));
    }

    static boolean isPythagorasTriplet(int a, int b, int c) {
        int a2 = a * a;
        int b2 = b * b;
        int c2 = c * c;

        int max = Math.max(a2, Math.max(b2, c2));

        if (max == a2) {
            return b2 + c2 == a2;
        } else if (max == b2) {
            return a2 + c2 == b2;
        } else {
            return a2 + b2 == c2;
        }
    }
}
