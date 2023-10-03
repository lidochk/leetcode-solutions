package org.example;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

//task 88 https://leetcode.com/problems/merge-sorted-array/?envType=study-plan-v2&envId=top-interview-150
public class MergeArray {
    public List<Integer> merge(int[] nums1, int m, int[] nums2, int n) {
        List<Integer> list1  = new ArrayList<>();
        List<Integer> list2  = new ArrayList<>();
        for (int num = 0; num<m; num++) {
            list1.add(nums1[num]);
        }
        for (int num = 0; num<n; num++) {
            list2.add(nums2[num]);
        }

        list1.addAll(list2);
        Collections.sort(list1);
        for (int i = 0; i < list1.size(); i++) {
            nums1[i] = list1.get(i);
        }
        return list1;
    }

    public static void main(String[] args) {
        MergeArray mergeArray = new MergeArray();
        int[] inputArray = {1,2,3,0,0,0};
        int[] inputArray2 = {2,5,6};
        System.out.println(mergeArray.merge(inputArray,3,inputArray2,3));
    }
}
