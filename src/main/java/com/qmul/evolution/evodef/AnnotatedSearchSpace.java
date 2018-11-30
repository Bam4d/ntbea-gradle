package com.qmul.evolution.evodef;


import com.qmul.evolution.ntbea.params.Param;

public interface AnnotatedSearchSpace extends SearchSpace {
    Param[] getParams();
}
