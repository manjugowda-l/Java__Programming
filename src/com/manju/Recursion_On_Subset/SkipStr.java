package com.manju.Recursion_On_Subset;

public class SkipStr {
    static void main() {
        System.out.println(skip("bccapplesda"));
    }
    static String skip(String up){
        if(up.isEmpty()){
            return " ";
        }

        if (up.startsWith("apple")){
            return skip(up.substring(5));
        }else{
            return up.charAt(0)+ skip(up.substring(1));
        }
    }

}
