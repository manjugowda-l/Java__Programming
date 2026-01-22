package com.manju.LinearSearch;
//https://leetcode.com/problems/find-numbers-with-even-number-of-digits/
public class EvenDigiys {
    static void main() {
        int[] arr={12,5,14,28,56,47,230,10};
        System.out.println(findNumbers(arr));
    }
    public static int findNumbers(int[] nums) {
            int count=0;
            for(int num:nums){
                if(even(num)){
                    count++;
                }
            }

            return count;
        }
        static boolean even(int n){
            int count=0;
            while(n>0){
                count++;
                n/=10;

            }

            if(count%2==0){
                return true;
            }else{
                return false;
            }

        }



}
