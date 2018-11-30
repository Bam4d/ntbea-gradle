package com.qmul.evolution.evodef;

public interface Mutator {
    int[] randMut(int[] v);

    DefaultMutator setSearchSpace(SearchSpace searchSpace);

    DefaultMutator setSwap(boolean swapMutation);
}
