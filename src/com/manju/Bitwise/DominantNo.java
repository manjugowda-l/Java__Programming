package com.manju.Bitwise;

public class DominantNo {
    static void main() {
        int[] arr={3,2,4,5,4,3,2};
        System.out.println(ans(arr));
    }
    static int ans(int[] arr){
        int unique=0;
        for (int n:arr){
            unique^=n;
        }
        return unique;
    }
}
