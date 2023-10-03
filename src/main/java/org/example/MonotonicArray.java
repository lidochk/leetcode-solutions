package org.example;
//задача 896 https://leetcode.com/problems/monotonic-array/
public class MonotonicArray {
    public boolean isMonotonic(int[] nums) {
        boolean dec=true,inc=true;
        for (int i=0; i<nums.length-1; i++){
           dec &= nums[i]>=nums[i+1];
           inc &= nums[i]<=nums[i+1];
        }
        return dec || inc;
    }

    public static void main(String[] args) {
        MonotonicArray monotonicArray = new MonotonicArray();
        int[] inputArray = {6,5,4,4};
        System.out.println(monotonicArray.isMonotonic(inputArray));
    }
}
