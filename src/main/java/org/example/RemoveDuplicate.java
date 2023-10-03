package org.example;

import java.util.ArrayList;
import java.util.List;

//task 26 https://leetcode.com/problems/remove-duplicates-from-sorted-array/?envType=study-plan-v2&envId=top-interview-150
public class RemoveDuplicate {
    public int removeDuplicates(int[] nums) {
        List<Integer> list = new ArrayList<>();
        List<Integer> newList = new ArrayList<>();
        for (int num:nums){
            list.add(num);
        }
        for (int num:list){
            if (!newList.contains(num)){
                newList.add(num);
            }
        }
        for (int i = 0; i < newList.size(); i++) {
            nums[i] = newList.get(i);
        }

        return newList.size();
    }


}
