package com.forme.squreEach;

import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.Arrays;

import static org.junit.jupiter.api.Assertions.*;


//          * square([1, 2, 3]) → [1, 4, 9]
//         * square([6, 8, -6, -8, 1]) → [36, 64, 36, 64, 1]
//         * square([]) → []
class SquareMainTest {

    @Test
    void square() {
        assertEquals(new ArrayList<Integer>(Arrays.asList(1,4,9)), Main.square(new ArrayList<Integer>(Arrays.asList(1,2,3))));
        assertEquals(new ArrayList<Integer>(Arrays.asList(36, 64, 36, 64, 1)), Main.square(new ArrayList<Integer>(Arrays.asList(6, 8, -6, -8, 1))));
        assertEquals(new ArrayList<Integer>(Arrays.asList()), Main.square(new ArrayList<Integer>(Arrays.asList())));
    }
}