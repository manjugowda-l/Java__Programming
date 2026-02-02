package com.manju.basics;

import java.util.Scanner;

public class Greeting {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        String name=input.nextLine();
        greeting(name);


    }
    static void greeting(String name){
        System.out.print("Hello Gud mrng  " +  name);

    }
}
