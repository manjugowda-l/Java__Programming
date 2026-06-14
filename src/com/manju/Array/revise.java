package com.manju.Array;

public class revise {
    static void main() {
        int[] arr = {12, 5, 8, 20, 3};
//1st element
        System.out.println(arr[0]);
        //last element
        System.out.println(arr[arr.length-1]);

        //change
        arr[2]=80;

        //print all
        for(int num:arr){
            System.out.print(num + " ");
        }

        System.out.println(" ");

        //max
        int max =0;
        for(int i=0;i<arr.length;i++){
            if(arr[i]>max){
                max=arr[i];
            }
        }
        System.out.println(max);


        //min

        int min =arr[0];
        for(int i=0;i<arr.length;i++){
            if(arr[i]<min){
                min=arr[i];
            }
        }
        System.out.println(min);


        //sum
        int sum =0;
        for(int i=0;i<arr.length;i++){
            sum+=arr[i];
        }
        System.out.println(sum);

        //linear search
        int[] arr = {12, 5, 80, 20, 3};

        System.out.println(linearSearch(arr, 20));   // Expected: 3
        System.out.println(linearSearch(arr, 100));  // Expected: -1

    }
    public static int linearSearch(int[] arr, int target){
        for(int i=0;i<arr.length;i++){
            if(arr[i]==target){
                return i;
            }
        }
        return -1 ;
    }
}
