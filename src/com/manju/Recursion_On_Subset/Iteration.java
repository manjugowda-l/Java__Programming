package com.manju.Recursion_On_Subset;

import java.util.ArrayList;
import java.util.List;

public class Iteration {

    public static void main(String[] args) {
        int[] arr = {1, 2, 3};

        List<List<Integer>> ans = subset(arr);

        System.out.println(ans);
    }

    static List<List<Integer>> subset(int[] arr) {
        List<List<Integer>> outer = new ArrayList<>();

        // empty subset
        outer.add(new ArrayList<>());

        // for each number in array
        for (int num : arr) {
            int n = outer.size(); // current size

            // loop only over existing subsets
            for (int i = 0; i < n; i++) {
                // create a copy of existing subset
                List<Integer> internal = new ArrayList<>(outer.get(i));
                internal.add(num); // add current number
                outer.add(internal); // add new subset
            }
        }
        return outer;
    }
}