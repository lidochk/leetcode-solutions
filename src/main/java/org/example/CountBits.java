package org.example;

import java.util.Arrays;

// задача 338 https://leetcode.com/problems/counting-bits/?envType=daily-question&envId=2023-09-01
public class CountBits {
    public int[] countBits(int n) {
        int[] arrNum = new int[n + 1];
        for (int i = 0; i <= n; i++) {
            arrNum[i] = Integer.bitCount(i);
        }
        return arrNum;
    }

    public static void main(String[] args) {
        CountBits countBits = new CountBits();
        System.out.println(Arrays.toString(countBits.countBits(3)));
    }
}
