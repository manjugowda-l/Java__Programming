package com.manju.LinearSearch;

public class FindMin {
    static void main() {
        int[] arr={12,5,14,28,56,47,230,10};
        System.out.println(min(arr));
    }
    static int min(int[] arr){
        int minVal=arr[0];
        for (int i=1;i< arr.length;i++){
            if(arr[i]<minVal){
                minVal=arr[i];
            }
        }
    return minVal;
    }
}
