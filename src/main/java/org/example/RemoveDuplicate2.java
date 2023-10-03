package org.example;

import java.util.ArrayList;
import java.util.List;

// task 80 https://leetcode.com/problems/remove-duplicates-from-sorted-array-ii/?envType=study-plan-v2&envId=top-interview-150
public class RemoveDuplicate2 {

    public int removeDuplicates(int[] nums) {
        if(nums.length < 3) return nums.length;
        int i = 0, j = 0;
        while(i < nums.length){
            nums[j++] = nums[i++];
            if(i < nums.length && nums[i] == nums[j-1])
                nums[j++] = nums[i++];
            while(i < nums.length && nums[i] == nums[j-1]) i++;
        }
        return j;
    }
}
