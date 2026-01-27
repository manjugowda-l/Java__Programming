package com.manju.BinarySearch;

import java.util.Arrays;

public class SortedMatrix {
    static void main() {
        int[][] arr={
                {1,2,3},
                {4,5,6},
                {7,8,9}
        };
        System.out.println(Arrays.toString(sorted(arr,6)));

    }

    static int[] binarySearch(int[][] matrix,int row,int colstart,int colend ,int target){
        while(colstart<=colend){
            int mid=colstart+(colend-colstart)/2;
            if(matrix[row][mid]==target){
                return new int[]{row,mid};
            }
            if(matrix[row][mid]<target){
                colstart=mid+1;
            }else{
                colend=mid-1;
            }
        }
        return new int[]{-1,-1};
    }
    static int[] sorted(int[][] matrix, int target) {
        int rows = matrix.length;
        int cols = matrix[0].length;

        if (rows == 1) {
            return binarySearch(matrix, 0, 0, cols - 1, target);
        }

        int rStart = 0;
        int rEnd = rows - 1;
        int cMid = cols / 2;

        // Reduce rows to 2
        while (rStart < rEnd - 1) {
            int mid = rStart + (rEnd - rStart) / 2;

            if (matrix[mid][cMid] == target) {
                return new int[]{mid, cMid};
            }
            if (matrix[mid][cMid] < target) {
                rStart = mid;
            } else {
                rEnd = mid;
            }
        }

        // Check middle column of the two rows
        if (matrix[rStart][cMid] == target) {
            return new int[]{rStart, cMid};
        }
        if (matrix[rStart + 1][cMid] == target) {
            return new int[]{rStart + 1, cMid};
        }

        // Search in 4 quadrants
        if (target <= matrix[rStart][cMid - 1]) {
            return binarySearch(matrix, rStart, 0, cMid - 1, target);
        }

        if (target >= matrix[rStart][cMid + 1] &&
                target <= matrix[rStart][cols - 1]) {
            return binarySearch(matrix, rStart, cMid + 1, cols - 1, target);
        }

        if (target <= matrix[rStart + 1][cMid - 1]) {
            return binarySearch(matrix, rStart + 1, 0, cMid - 1, target);
        }

        return binarySearch(matrix, rStart + 1, cMid + 1, cols - 1, target);
    }

}
