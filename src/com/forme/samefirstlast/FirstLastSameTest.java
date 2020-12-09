package com.forme.samefirstlast;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;


class FirstLastSameTest {

    @Test
    void firstLastSame() {
        int[] nums = new int[]{1, 2, 3};
        int[] nums1 = new int[]{1, 2, 3, 1};
        int[] nums2 = new int[]{1, 2, 1};
        int[] nums3 = new int[]{};
        Assertions.assertFalse(Main.sameFirstLast(nums));
        Assertions.assertTrue(Main.sameFirstLast(nums1));
        Assertions.assertTrue(Main.sameFirstLast(nums2));
        Assertions.assertFalse(Main.sameFirstLast(nums3));
    }
}