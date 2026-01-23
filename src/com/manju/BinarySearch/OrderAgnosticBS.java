package com.manju.BinarySearch;

public class OrderAgnosticBS {
    static void main() {
        int[] arr={-18,-12,-6,0,12,14,23,52,67,89};
        int target=23;
        int ans=OrderAgnosticBS(arr,target);
        if(ans==-1){
            System.out.println("target value is not found");
        }else {
            System.out.println("Target Value  is present at index " + ans);
        }
    }
    static int OrderAgnosticBS(int[] arr,int target){
        int start=0;
        int end=arr.length-1;
        boolean isAsc =arr[start]<arr[end];

        while(start<=end){
            int mid=start+(end-start)/2;
            if(arr[mid]==target){
                return mid;
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
        return -1;
    }
}
