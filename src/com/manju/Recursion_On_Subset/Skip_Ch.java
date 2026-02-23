package com.manju.Recursion_On_Subset;

public class Skip_Ch {
    static void main() {
        System.out.println(skip("bccasda"));

    }
    static String skip(String up){
        if(up.isEmpty()){
            return " ";
        }
        char ch=up.charAt(0);
        if (ch=='a'){
            return skip(up.substring(1));
        }else{
            return ch + skip(up.substring(1));
        }
    }
}
