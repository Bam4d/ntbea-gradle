package com.qmul.evolution.utilities;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class PickerTest {

    @Test
    public void testPickerSort() {
        Picker<Integer> picker = new Picker<Integer>(Picker.MAX_FIRST);

        picker.add(2.0, 1);
        picker.add(6.0, 2);
        picker.add(1.1, 3);
        picker.add(5.0, 0);


        assertEquals((Integer)2, picker.getBest());
        assertEquals((Number)6.0, picker.getBestScore());

    }
}
