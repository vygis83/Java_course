package com.vygutis;

import java.util.Arrays;
import java.util.stream.IntStream;

/**
 * Created by Vygis on 09/03/2016.
 */
public class Solution {

    public static int BalancePoint(int[] input) {
        // Your code goes here
        if(input.length > 2) {
            int[] part_1 = null;
            int[] part_2 = null;
            for(int i=1; i<(input.length-1); i++) {
                part_1 = Arrays.copyOfRange(input, 0, i);
                part_2 = Arrays.copyOfRange(input, i+1, input.length);
                if(IntStream.of(part_1).sum() == IntStream.of(part_2).sum()) {
                    return i;
                }
            }
            return -1;
        } else {
            return -1;
        }

    }

}
