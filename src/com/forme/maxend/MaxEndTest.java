package com.forme.maxend;

import org.junit.jupiter.api.Test;

import java.util.Arrays;

import static org.junit.jupiter.api.Assertions.*;

class MaxEndTest {

    @Test
    void maxEndTest() {
        int[] nums = new int[]{1, 2, 3};
        int[] nums1 = new int[]{11, 5, 9};
        int[] nums2 = new int[]{2, 11, 3};
        assert (Arrays.equals(new int[]{3, 3, 3}, Main.maxEnd3(nums)));
        assert (Arrays.equals(new int[]{11, 11, 11}, Main.maxEnd3(nums1)));
        assert (Arrays.equals(new int[]{3, 3, 3}, Main.maxEnd3(nums2)));
    }


}