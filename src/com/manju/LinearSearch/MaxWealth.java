package com.manju.LinearSearch;
//https://leetcode.com/problems/richest-customer-wealth/
public class MaxWealth {
    static void main() {
        int[][] arr={
                {14,12,8},
                {18,12,3,9},
                {54,24},
                {18,52,42,14}
        };

        System.out.println(maximumWealth(arr));

    }
    public static int maximumWealth(int[][] accounts) {

        int max=0;
        for(int person=0;person<accounts.length;person++){
            int rowsum=0;
            for(int account=0;account<accounts[person].length;account++){
                rowsum+=accounts[person][account];
            }
            if(rowsum>max){
                max=rowsum;
            }
        }
        return max;
    }
}
