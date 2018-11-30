package com.qmul.evolution.ntbea;

import org.junit.Test;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import static org.junit.Assert.assertArrayEquals;

public class IntArrayPatternTest {

    @Test
    public void testEquals() {

        int[] x = {0, 1, 2, 3, 3};
        int[] ix1 = {0, 3};
        int[] ix2 = {0, 4};
        int[] ix3 = {0, 1};

        IntArrayPattern p1 = new IntArrayPattern(x, ix1);
        IntArrayPattern p2 = new IntArrayPattern(x, ix2);
        IntArrayPattern p3 = new IntArrayPattern(x, ix3);

        assertArrayEquals(p1.toArray(), new int[]{0, 3});
        assertArrayEquals(p2.toArray(), new int[]{0, 3});
        assertArrayEquals(p3.toArray(), new int[]{0, 1});

    }

    @Test
    public void testSortComparator() {
        int[] x = {0, 1, 2, 3, 3};
        int[] ix1 = {0, 3};
        int[] ix2 = {0, 4};
        int[] ix3 = {0, 2};
        int[] ix4 = {0, 1};

        List<IntArrayPattern> arrayPatterns = new ArrayList<>();
        arrayPatterns.add(new IntArrayPattern(x, ix1));
        arrayPatterns.add(new IntArrayPattern(x, ix2));
        arrayPatterns.add(new IntArrayPattern(x, ix3));
        arrayPatterns.add(new IntArrayPattern(x, ix4));

        Collections.sort(arrayPatterns);

        assertArrayEquals(arrayPatterns.get(0).toArray(), new int[]{0, 1});
        assertArrayEquals(arrayPatterns.get(1).toArray(), new int[]{0, 2});
        assertArrayEquals(arrayPatterns.get(2).toArray(), new int[]{0, 3});
        assertArrayEquals(arrayPatterns.get(3).toArray(), new int[]{0, 3});


    }

}
