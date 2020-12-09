package com.forme.rotateLeft3;

import org.junit.jupiter.api.Test;

import java.util.Arrays;

import static org.junit.jupiter.api.Assertions.*;

/**
 * Expected	Run
 * rotateLeft3([1, 2, 3]) → [2, 3, 1]	[2, 3, 1]	OK
 * rotateLeft3([5, 11, 9]) → [11, 9, 5]	[11, 9, 5]	OK
 * rotateLeft3([7, 0, 0]) → [0, 0, 7]	[0, 0, 7]	OK
 * rotateLeft3([1, 2, 1]) → [2, 1, 1]	[2, 1, 1]	OK
 * rotateLeft3([0, 0, 1]) → [0, 1, 0]	[0, 1, 0]
 */
class RotateTest {

    @Test
    void rotateLeft3Test() {
        assert (Arrays.equals(new int[]{2, 3, 1}, Main.rotateLeft3(new int[]{1, 2, 3})));
        assert (Arrays.equals(new int[]{11, 9, 5}, Main.rotateLeft3(new int[]{5, 11, 9})));
        assert (Arrays.equals(new int[]{0, 0, 7}, Main.rotateLeft3(new int[]{7, 0, 0})));
        assert(Arrays.equals(new int[]{2, 1, 1}, Main.rotateLeft3(new int[]{1, 2, 1})));
        assert(Arrays.equals(new int[]{0, 1, 0}, Main.rotateLeft3(new int[]{0, 0, 1})));
    }
}