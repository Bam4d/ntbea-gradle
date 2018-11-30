
package com.qmul.evolution.utilities;

public class ElapsedTimer {
    // allows for easy reporting of elapsed time
    long oldTime;

    public ElapsedTimer() {
        oldTime = System.currentTimeMillis();
    }

    public long elapsed() {
        return System.currentTimeMillis() - oldTime;
    }

    public void reset() {
        oldTime = System.currentTimeMillis();
    }

    public String toString() {
        // now resets the timer...
        String ret = elapsed() + " ms elapsed";
        reset();
        return ret;
    }
}


