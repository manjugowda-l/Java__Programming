package com.manju.LinearSearch;

import java.util.Arrays;

public class Searchin2DArrays {
    static void main() {
       int[][] arr={
               {14,12,8},
               {18,12,3,9},
               {54,24},
               {18,52,42,14}
       };
       int target =24;
       int[] ans =search(arr,target);
       System.out.println(Arrays.toString(ans));

    }
    static int[] search(int[][] arr,int target){
        if(arr.length==0){
            return new int[]{-1,-1};
        }
        for(int i=0;i< arr.length;i++){
            for(int j=0;j<arr[i].length;j++){
                if(arr[i][j]==target){
                    return new int[]{i,j};
                }
            }
        }
    return new int[]{-1,-1};
    }
}
