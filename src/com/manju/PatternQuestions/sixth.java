package com.manju.PatternQuestions;

public class sixth {
    static void main() {
        int n=5;
        pattern6(n);
    }
    static void pattern6(int n){
        for (int row=1;row<=2*n-1;row++){
            int totalcolsinrow=row>n?2*n-row:row;
            int noofspaces=n-totalcolsinrow;
            for (int s=0;s<noofspaces;s++){
                System.out.print(" ");
            }
            for(int col=0;col<totalcolsinrow;col++){
                System.out.print("* ");
            }
            System.out.println();
        }

    }
}
