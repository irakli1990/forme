package com.forme.multyplyby2;

import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;


/**
 * doubling([1, 2, 3]) → [2, 4, 6]
 * doubling([6, 8, 6, 8, -1]) → [12, 16, 12, 16, -2]
 * doubling([]) → []
 */
class Dubling {

    @Test
    void doubling() {
        assertEquals (new ArrayList<Integer>(Arrays.asList(2,4,6)), Main.doubling(new ArrayList<Integer>(Arrays.asList(1,2,3))));
        assertEquals (new ArrayList<Integer>(Arrays.asList()), Main.doubling(new ArrayList<Integer>(Arrays.asList())));
        assertEquals (new ArrayList<Integer>(Arrays.asList()), Main.doubling(new ArrayList<Integer>(Arrays.asList())));
        assertEquals (new ArrayList<Integer>(Arrays.asList(2,2,2)), Main.doubling(new ArrayList<Integer>(Arrays.asList(1,1,1))));
    }
}