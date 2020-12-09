package com.forme.sumofarray;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SumTest {

    @Test
    void sumTest() {
        int[] num = new int[]{1, 2, 3};
        int[] num1 = new int[]{5, 11, 2};
        int[] num2 = new int[]{7, 0, 0};
        assertEquals(6, Main.sum3(num));
        assertEquals(18, Main.sum3(num1));
        assertEquals(7, Main.sum3(num2));
    }
}