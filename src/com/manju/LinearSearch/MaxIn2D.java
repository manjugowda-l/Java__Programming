package com.manju.LinearSearch;

public class MaxIn2D {
    static void main() {
        int[][] arr={
                {14,12,8},
                {18,12,3,9},
                {54,24},
                {18,52,42,14}
        };

        System.out.println(max(arr));

    }

    static int max(int[][] arr){
        int maxVal=Integer.MIN_VALUE;
        for(int i=0;i< arr.length;i++){
            for(int j=0;j<arr[i].length;j++){
                if(arr[i][j]>maxVal){
                    maxVal=arr[i][j];
                }
            }
        }
        return maxVal;
    }
}
