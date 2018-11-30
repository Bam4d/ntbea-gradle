package com.qmul.evolution.utilities;

import org.junit.Test;

import java.util.Arrays;

public class StatSummarySpeedTest {

    @Test
    public void testSpeed() {

        for(int e : Arrays.asList(1,2,3,4,5,6,7)) {

            int n = (int)Math.pow(10,e);
            StatSummary[] ssa = new StatSummary[n];

            ElapsedTimer t = new ElapsedTimer();

            for (int i = 0; i < n; i++) {
                ssa[i] = new StatSummary();
                ssa[i].add(i);
            }
            System.out.println("Created: " + n);
            System.out.println(t);
        }

    }
}
