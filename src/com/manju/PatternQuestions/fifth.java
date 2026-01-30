package com.manju.PatternQuestions;

public class fifth {
    static void main() {
        int n=5;
        pattern5(n);
    }
    static void pattern5(int n){
        for (int row=1;row<=2*n-1;row++){
            int totalcolsinrow=row>n?2*n-row:row;
            for(int col=0;col<totalcolsinrow;col++){
                System.out.print("*");
            }
            System.out.println();
        }

    }
}
