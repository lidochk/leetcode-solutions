package org.example;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
//задача 9 https://leetcode.com/problems/palindrome-number/
public class PalindromeNumber {
    public boolean isPalindrome(int x) {
        int temp = x;
        boolean isPalindrom = false;
        List<Integer> digits = new ArrayList<>();
        while (temp > 0) {
            digits.add(temp % 10);
            temp /= 10;
        }
        int num = digits.size();
        System.out.println("Size of array " + num);
        for (int i = 0; i < num ; i++) {
            isPalindrom = Objects.equals(digits.get(i), digits.get(num - i-1));
            if (!isPalindrom) break;
        }
        if (x==0) isPalindrom = true;
        return isPalindrom;
    }

    public static void main(String[] args) {

        PalindromeNumber palindromeNumber = new PalindromeNumber();
        System.out.println(palindromeNumber.isPalindrome(1000021)); // 9
    }
}
