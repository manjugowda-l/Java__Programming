package com.manju.basics;

import java.util.HashMap;
import java.util.Arrays;

public class Twosumhash {

    // main method must have this exact signature
    public static void main(String[] args) {

        int[] nums = {2, 7, 11, 15};
        int target = 9;

        int[] result = twoSum(nums, target);

        // printing result
        System.out.println(Arrays.toString(result));
    }

    static int[] twoSum(int[] nums, int target) {

        HashMap<Integer, Integer> map = new HashMap<>();

        for (int i = 0; i < nums.length; i++) {

            int complement = target - nums[i];

            if (map.containsKey(complement)) {
                return new int[]{map.get(complement), i};
            }

            map.put(nums[i], i);
        }

        return new int[]{}; // guaranteed solution, so this won't run
    }
}
