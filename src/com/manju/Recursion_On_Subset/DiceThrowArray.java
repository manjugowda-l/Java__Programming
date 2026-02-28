package com.manju.Recursion_On_Subset;

import java.util.ArrayList;

public class DiceThrowArray {
    static void main() {
        System.out.println(dice("",4 ));
    }

    static ArrayList<String> dice(String p, int target){
        if (target==0) {
            ArrayList<String> list =new ArrayList<>();
            list.add(p);
            return list;
        }
        ArrayList<String> ans =new ArrayList<>();
        for(int i=1;i<=6&&i<=target;i++){
            ans.addAll(dice(p+i,target-i));
        }
        return ans;
    }
}
