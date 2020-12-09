package com.forme.makepi;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class MakePiTest {

    @Test
    void makePitest() {
        int[] pis = new int[]{3, 1, 4};
        for (int i = 0; i < pis.length; i++) {
            assertEquals(Main.makePi()[i], pis[i]);
        }
    }

}