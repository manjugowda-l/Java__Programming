package com.manju.PatternQuestions;

public class Second {
    static void main() {
        int n=5;
        pattern2(n);
    }
    static void pattern2(int n){
        for (int row=1;row<=n;row++){
            for(int col=1;col<=n;col++){
                System.out.print("*");
            }
            System.out.println();
        }

    }
}
