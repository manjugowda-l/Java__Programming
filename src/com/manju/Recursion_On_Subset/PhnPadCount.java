package com.manju.Recursion_On_Subset;

import java.util.ArrayList;

public class PhnPadCount {

    public static void main(String[] args) {
        int ans = pad("", "12");
        System.out.println(ans);
    }

    static int pad(String p, String up) {

        // base case
        if (up.isEmpty()) {

            return 1;
        }

        int digit = up.charAt(0) - '0';

        int count=0;

        // same loop logic as before
        for (int i = (digit - 1) * 3; i < digit * 3; i++) {
            char ch = (char) ('a' + i);

            // collect results instead of printing
            count=count+pad(p + ch, up.substring(1));
        }

        return count;
    }
}
