package com.forme.firstlast6;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static com.forme.firstlast6.Main.firstLast6;

class FirstLastTest {

    @Test
    void firstLast6Test() {
        int[] nums = new int[]{1, 2, 6};
        int[] nums1 = new int[]{6, 1, 2, 3};
        int[] nums2 = new int[]{13, 6, 1, 2, 3};
        Assertions.assertTrue(firstLast6(nums));
        Assertions.assertTrue(firstLast6(nums1));
        Assertions.assertFalse(firstLast6(nums2));
    }
}