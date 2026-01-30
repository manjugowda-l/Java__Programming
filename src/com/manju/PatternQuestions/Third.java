package com.manju.PatternQuestions;

public class Third {
    static void main() {
        int n=5;
        pattern3(n);
    }
    static void pattern3(int n){
        for (int row=1;row<=n;row++){
            for(int col=0;col<=n-row;col++){
                System.out.print("*");
            }
            System.out.println();
        }

    }
}
