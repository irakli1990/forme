package com.forme.commonend;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CommonEndTest {
    /**
     * commonEnd([1, 2, 3], [7, 3]) → true	true	OK
     * commonEnd([1, 2, 3], [7, 3, 2]) → false	false	OK
     * commonEnd([1, 2, 3], [1, 3]) → true	true	OK
     * commonEnd([1, 2, 3], [1]) → true	false	X
     * commonEnd([1, 2, 3], [2]) → false	false	OK
     */

    @Test
    void commonEndTest() {
        int[] a = new int[]{};
        int[] b = new int[]{};
        int[] a1 = new int[]{1, 2, 3};
        int[] b1 = new int[]{7, 3};
        int[] a2 = new int[]{1, 2, 3};
        int[] b2 = new int[]{1};
        int[] a3 = new int[]{1, 2, 3};
        int[] b3 = new int[]{2};
        assertFalse(Main.commonEnd(a, b));
        assertTrue(Main.commonEnd(a1, b1));
        assertTrue(Main.commonEnd(a2, b2));
        assertFalse(Main.commonEnd(a3, b3));
    }

}