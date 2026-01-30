package com.manju.PatternQuestions;

public class ninth {
    static void main() {
        int n=4;
        pattern7(n);
    }
    static void pattern7(int n){
        int originalN=n;
        n=n*2;
        for (int row=0;row<=n;row++){

            for(int col=0;col<=n;col++){
                int atEveryindex=originalN-Math.min(Math.min(row,col),Math.min(n-row,n-col));
                System.out.print(atEveryindex+ " ");
            }
            System.out.println();
        }

    }
}
