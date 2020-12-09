package com.forme.rotateLeft3;


/**
 * Given an array of ints length 3, return an array with the elements
 * "rotated left" so {1, 2, 3} yields {2, 3, 1}
 * rotateLeft3([1, 2, 3]) → [2, 3, 1]
 * rotateLeft3([5, 11, 9]) → [11, 9, 5]
 * rotateLeft3([7, 0, 0]) → [0, 0, 7]
 *
 */
public class Main {
    public static int[] rotateLeft3(int[] nums) {
        int[] temp = new int[nums.length];
        if (nums.length > 0) {
            for (int i = 0, j = nums.length - 1; i < nums.length; i++, j--) {
                if (i == 0) {
                    temp[j] = nums[i];
                } else {
                    temp[j] = nums[nums.length - i];
                }
            }
        }
        return temp;
    }
}
