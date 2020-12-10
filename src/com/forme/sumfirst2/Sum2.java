package com.forme.sumfirst2;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class Sum2 {

    @Test
    void sum2() {
        assertEquals(3, Main.sum2(new int[]{1,2}));
        assertEquals(4, Main.sum2(new int[]{2,2}));
        assertEquals(6, Main.sum2(new int[]{1,5,1,1}));
        assertEquals(11, Main.sum2(new int[]{1,10,5,1}));
        assertEquals(12, Main.sum2(new int[]{6,6,1,1}));
        assertEquals(1, Main.sum2(new int[]{1}));
        assertEquals(0, Main.sum2(new int[]{}));
    }
}