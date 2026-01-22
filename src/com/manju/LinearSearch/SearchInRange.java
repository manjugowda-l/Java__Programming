package com.manju.LinearSearch;

public class SearchInRange {
    static void main() {
        int[] arr={18,15,1,23,64,52,32,41};
        int target=64;
        int ans=linearSearch(arr,target,1,4);
        if(ans==-1){
            System.out.println("target value is not found");
        }else {
            System.out.println("Target Value  is present at index " + ans);
        }
    }

    static int linearSearch(int[] arr,int target,int start,int end) {
        if (arr.length==0){
            return -1;
        }
        for (int index=start;index<=end;index++){
            if(arr[index]==target) {
                return index;
            }

        }
        return -1;
    }
}
