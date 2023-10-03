package org.example;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

//task 1512 https://leetcode.com/problems/number-of-good-pairs/?envType=daily-question&envId=2023-10-03
public class GoodPair {
    public int numIdenticalPairs(int[] nums) {
        int count=0;
        for (int i=0; i<nums.length; i++){
            for (int y=i+1; y<nums.length; y++){
                if (nums[i]==nums[y]){
                    count++;
                }
            }
        }
        return count;
    }

    public static void main(String[] args) {
        GoodPair goodPair = new GoodPair();
        int[] inputArray = {1,2,3,1,1,3};
        System.out.println(goodPair.numIdenticalPairs(inputArray));
    }
}
