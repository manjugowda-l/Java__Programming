package com.manju.LinearSearch;

public class FindMax {
    static void main() {
        int[] arr={12,5,14,28,56,47,230,10};
        System.out.println(max(arr));
    }
    static int max(int[] arr){
        int maxVal=arr[0];
        for (int i=1;i< arr.length;i++){
            if(arr[i]>maxVal){
                maxVal=arr[i];
            }
        }
        return maxVal;
    }
}
