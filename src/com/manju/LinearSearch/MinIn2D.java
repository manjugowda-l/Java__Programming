package com.manju.LinearSearch;

import java.util.Arrays;

public class MinIn2D {
    static void main() {
        int[][] arr={
                {14,12,8},
                {18,12,3,9},
                {54,24},
                {18,52,42,14}
        };

        System.out.println(min(arr));

    }
    static int min(int[][] arr){
        int minVal=Integer.MAX_VALUE;
        for(int i=0;i< arr.length;i++){
            for(int j=0;j<arr[i].length;j++){
                if(arr[i][j]<minVal){
                    minVal=arr[i][j];
                }
            }
        }
        return minVal;
    }
}
