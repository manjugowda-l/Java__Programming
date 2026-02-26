package com.manju.BinarySearch;

public class CeilingOfNumber {
    static void main() {
        int[] arr={-18,-12,-6,0,12,23,52,67,89};
        int target=14;
        int ans= Ceiling(arr,target);
        System.out.println("Smallest value greater than or equal to target is  " + ans);

    }
    static int Ceiling(int[] arr, int target){
        int start=0;
        int end=arr.length-1;
        boolean isAsc =arr[start]<arr[end];

        while(start<=end){
            int mid=start+(end-start)/2;
            if(arr[mid]==target){
                return arr[mid];
            }
            if(isAsc){
                if(target<arr[mid]){
                    end=mid-1;

                }else if (target>arr[mid]) {
                    start = mid + 1;
                }

            }else{
                if(target>arr[mid]){
                    end=mid-1;

                }else if (target<arr[mid]) {
                    start = mid + 1;
                }
            }
        }
        return arr[start];
    }
}
