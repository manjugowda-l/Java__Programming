package com.manju.Recursion_On_Subset;

import java.util.ArrayList;

public class PhnPad {

    public static void main(String[] args) {
        ArrayList<String> ans = pad("", "12");
        System.out.println(ans);
    }

    static ArrayList<String> pad(String p, String up) {

        // base case
        if (up.isEmpty()) {
            ArrayList<String> list = new ArrayList<>();
            list.add(p);
            return list;
        }

        int digit = up.charAt(0) - '0';

        ArrayList<String> ans = new ArrayList<>();

        // same loop logic as before
        for (int i = (digit - 1) * 3; i < digit * 3; i++) {
            char ch = (char) ('a' + i);

            // collect results instead of printing
            ans.addAll(pad(p + ch, up.substring(1)));
        }

        return ans;
    }
}
