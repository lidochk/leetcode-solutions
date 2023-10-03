package org.example;

import java.util.ArrayList;
import java.util.Arrays;

// задача 905 https://leetcode.com/problems/sort-array-by-parity/?envType=daily-question&envId=2023-09-28
public class Parity {
    public int[] sortArrayByParity(int[] nums) {
        int[] even = new int[nums.length];
        int[] odd = new int[nums.length];
        int evenIdx = 0;
        int oddIdx = 0;

        for (int num : nums) {
            if (num % 2 == 0) {
                even[evenIdx++] = num;
            } else {
                odd[oddIdx++] = num;
            }
        }

        // Создаем и заполняем результат сначала четными, затем нечетными числами
        int[] result = new int[nums.length];
        System.arraycopy(even, 0, result, 0, evenIdx);
        System.arraycopy(odd, 0, result, evenIdx, oddIdx);

        return result;
    }
    public static void main(String[] args) {


            Parity parity = new Parity();
            int[] inputArray = {1, 2, 3, 4, 5};
            int[] result = parity.sortArrayByParity(inputArray);

            // Выводим результат
            for (int num : result) {
                System.out.print(num + " ");
            }
    }

}
