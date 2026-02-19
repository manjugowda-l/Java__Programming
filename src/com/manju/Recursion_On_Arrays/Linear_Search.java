package com.manju.Recursion_On_Arrays;

public class Linear_Search {
    static void main() {
        int[] arr={1,2,3,4,5};
        System.out.println(find(arr,4,0));

    }
    static boolean find(int[] arr, int target, int index){
        if(index==arr.length){
            return false;
        }
        return arr[index]==target|| find(arr,target,index+1);
    }
}
