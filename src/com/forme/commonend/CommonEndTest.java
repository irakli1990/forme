package com.forme.commonend;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CommonEndTest {

    @Test
    void commonEndTest(){
       int[] a = new int[]{};
       int[] b = new int[]{};
       int[] a1 = new int[]{1, 2, 3};
       int[] b1 = new int[]{7, 3};
       assertFalse(Main.commonEnd(a,b));
       assertTrue(Main.commonEnd(a1,b1));
    }

}