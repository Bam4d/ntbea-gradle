package com.qmul.evolution.utilities;

public class Picker<T> {
    // keeps just the best item so far
    public static int MAX_FIRST = 1;
    public static int MIN_FIRST = -1;

    private T bestYet;
    private Double bestScore;
    private int nItems;
    private int order;

    // boolean strict = true;
    public Picker() {
        this(MAX_FIRST);
    }

    public Picker(int order) {
        this.order = order;
        reset();
    }

    public void add(double score, T value) {
        // each value must be unique: keep it in the set of values
        // and throw an exception if violated

        if (bestYet == null) {
            bestScore = score;
            bestYet = value;
        } else {
            // System.out.println(order * score + " >? " + bestScore * order + " : " + (order * score > bestScore * order));
            if (order * score > bestScore * order) {
                bestScore = score;
                bestYet = value;
            }
        }
        nItems++;
    }

    public int size() {
        return nItems;
    }

    public T getBest() {
        return bestYet;
    }

    public Double getBestScore() {
        return bestScore;
    }

    public void reset() {
        nItems = 0;
        bestScore = (order == MAX_FIRST) ? Double.NEGATIVE_INFINITY : Double.POSITIVE_INFINITY;
    }

    public String toString() {
        return "Picker: " + bestYet + " : " + bestScore;
    }
}
