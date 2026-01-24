package com.manju.BinarySearch;

public class RotationCount {
    static void main() {
        int[] nums={4,5,6,7,0,1,2};
        int ans=search(nums);
        System.out.println("Rotation count will be " +ans );

    }
    public static int search(int[] nums) {
        int pivot=FindPivot(nums)+1;

        return pivot;




    }
    static  int FindPivot(int[] nums){
        int start=0;
        int end=nums.length-1;
        while(start<=end){
            int mid=start+(end-start)/2;
            if(mid<end && nums[mid]>nums[mid+1]){
                return mid;
            }
            if(mid>start&&nums[mid]<nums[mid-1]){
                return mid;
            }
            if(nums[mid]<=nums[start]){
                end=mid-1;
            }else{
                start=mid+1;
            }

        }
        return -1;
    }
}
