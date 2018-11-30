package com.qmul.evolution.ntbea;

import sun.misc.IOUtils;
import sun.nio.ch.IOUtil;

import java.util.Arrays;
import java.util.HashMap;

/**
 *  This class provides a hashable and comparable wrapper around an array of int.
 *
 *  It provides equals, compareTo, and hashCode methods
 */

public class IntArrayPattern implements Comparable<IntArrayPattern> {

    final private int[] v;

    public int[] toArray() {
        return v;
    }

    public IntArrayPattern(int[] v) {
        this.v = v;
    }

    public IntArrayPattern(int[] x, int[] ix) {
        v = new int[ix.length];

        for (int i=0; i<ix.length; i++) {
            v[i] = x[ix[i]];
        }
    }

    public int hashCode() {
        return Arrays.hashCode(v);
    }

    public boolean equals(int[] pattern) {
        return Arrays.equals(v, pattern);
    }

    public int compareTo(IntArrayPattern p) {
        try {
            // now iterate over all the values
            for (int i=0; i<v.length; i++) {
                if (v[i] > p.v[i]) {
                    return 1;
                }
                if (v[i] < p.v[i]) {
                    return -1;
                }
            }
            return 0;
        } catch (Exception e) {
            e.printStackTrace();
            return 0;
        }

    }

    public String toString() {
        return Arrays.toString(v);
    }

}
