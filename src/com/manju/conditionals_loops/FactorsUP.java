package com.manju.conditionals_loops;

public class FactorsUP {
    static void main() {
        int n=20;
        factors(n);
    }
    static void factors(int n){
        for(int i=1;i<=Math.sqrt(n);i++){
            if(n%i==0){
                if(n/i==i){
                    System.out.print(i+" ");
                }else{
                    System.out.print(i +" "+n/i+" ");
                }


            }
        }
    }
}
