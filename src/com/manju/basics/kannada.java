package com.manju.basics;

public class kannada {
    public static void main(String[] args) {
        int reverse=12345;
        int ans =0;
        while(reverse>0){
            int rem=reverse%10;

            ans =ans*10+rem;
            reverse /=10;


        }
        System.out.println(ans);
    }
}
