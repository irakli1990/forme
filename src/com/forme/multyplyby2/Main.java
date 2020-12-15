package com.forme.multyplyby2;

import javax.swing.*;
import java.util.ArrayList;
import java.util.List;

public class Main {
    public static List<Integer> doubling(List<Integer> nums) {
        List<Integer> temp = new ArrayList<Integer>();
        if (nums.size() > 0) {
            for (Integer num : nums) {
                temp.add(num * 2);
            }
        }
        return temp;
    }

}
