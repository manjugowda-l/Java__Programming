package com.manju.BinarySearch;

import java.util.Arrays;
//https://leetcode.com/problems/find-first-and-last-position-of-element-in-sorted-array/
public class Find_firstandlast_Position {
    static void main() {
        int[] arr={5,7,7,7,7,8,8,10};
        int target=7;
        int[] ans= searchRange(arr,target);

        System.out.println(Arrays.toString(ans));
    }
    public static int[] searchRange(int[] nums, int target) {
        int[] ans ={-1,-1};
        ans[0]=search(nums,target,true);
        if(ans[0]!=-1){
            ans[1] =search(nums,target,false);
        }


        return ans;

    }

    public static  int search(int[] nums,int target,boolean findstartindex){
        int ans=-1;
        int start=0;
        int end=nums.length-1;
        while(start<=end){
            int mid=start+(end-start)/2;
            if(target>nums[mid]){
                start=mid+1;
            }else if (target<nums[mid]){
                end=mid-1;
            }else{
                ans=mid;
                if(findstartindex){
                    end=mid-1;
                }else{
                    start=mid+1;
                }

            }

        }
        return ans;
    }
}
