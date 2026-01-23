package com.manju.BinarySearch;

public class BinarySearch {
    static void main() {
        int[] arr={-18,-12,-6,0,12,14,23,52,67,89};
        int target=23;
        int ans=binarySearch(arr,target);
        if(ans==-1){
            System.out.println("target value is not found");
        }else {
            System.out.println("Target Value  is present at index " + ans);
        }
    }
    static int binarySearch(int[] arr,int target){
        int start=0;
        int end=arr.length-1;
        while(start<=end){
            int mid=start+(end-start)/2;
            if(target<arr[mid]){
                end=mid-1;

            }else if (target>arr[mid]){
                start=mid+1;
            }else {
                return mid;
            }
        }
    return -1;
    }
}
