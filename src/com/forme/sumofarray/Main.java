package com.forme.sumofarray;


/**
 *  Given an array of ints length 3, return the sum of all the elements.
 * sum3([1, 2, 3]) → 6
 * sum3([5, 11, 2]) → 18
 * sum3([7, 0, 0]) → 7
 */
public class Main {
    public static int sum3(int[] nums) {
        int sum = 0;
        if (nums.length > 0) {
            for (int num : nums) {
                sum += num;
            }
        }
        return sum;
    }

}
