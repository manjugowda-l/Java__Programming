package com.manju.PatternQuestions;

public class seven {
    static void main() {
        int n=5;
        pattern7(n);
    }
    static void pattern7(int n){
        for (int row=1;row<=n;row++){
            int noofspaces=n-row;
            for (int s=0;s<noofspaces;s++){
                System.out.print(" ");
            }
            for(int col=row;col>=1;col--){
                System.out.print(col);
            }
            for(int col=2;col<=row;col++){
                System.out.print(col);
            }
            System.out.println();
        }

    }

}
