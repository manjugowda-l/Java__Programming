package com.manju.Recursion_On_Arrays;

public class LinearSearch2 {
    static void main() {
        int[] arr={1,2,3,4,5};
        System.out.println(find(arr,4,0));

    }
    static int find(int[] arr, int target, int index){
        if(index==arr.length){
            return -1;
        }
        if(arr[index]==target){
            return index;
        }else {
            return find(arr, target, index + 1);
        }
    }
}
