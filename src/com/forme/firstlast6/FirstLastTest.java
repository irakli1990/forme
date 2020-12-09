package com.forme.firstlast6;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;


class FirstLastTest {

    @Test
    void firstLast6Test() {
        int[] nums = new int[]{1, 2, 6};
        int[] nums1 = new int[]{6, 1, 2, 3};
        int[] nums2 = new int[]{13, 6, 1, 2, 3};
        Assertions.assertTrue(Main.firstLast6(nums));
        Assertions.assertTrue(Main.firstLast6(nums1));
        Assertions.assertFalse(Main.firstLast6(nums2));
    }
}