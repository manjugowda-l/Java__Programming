package com.manju.PatternQuestions;

public class Fourth {
    static void main() {
        int n=5;
        pattern1(n);
    }
    static void pattern1(int n){
        for (int row=1;row<=n;row++){
            for(int col=1;col<=row;col++){
                System.out.print(col);
            }
            System.out.println();
        }

    }
}
