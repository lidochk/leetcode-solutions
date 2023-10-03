package org.example;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

//task 27 https://leetcode.com/problems/remove-element/?envType=study-plan-v2&envId=top-interview-150
public class RemoveElement {
    public int removeElement(int[] nums, int val) {
        List<Integer> list = new ArrayList<>();
        for (int num : nums) {
            list.add(num);
        }

        for (int i=0; i<list.size();i++){
            if (list.get(i) == val){
                list.remove(i);
                i--;
            }
        }
        for (int i = 0; i < list.size(); i++) {
            nums[i] = list.get(i);
        }
        return list.size();
    }

    public static void main(String[] args) {
        RemoveElement removeElement = new RemoveElement();
        int[] inputArray = {3,2,2,3};
        System.out.println(removeElement.removeElement(inputArray,3));
    }
}
