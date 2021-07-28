package com.nisum.exercise6.utils;

import com.nisum.exercise6.interfaces.PerformOperation;
import lombok.NoArgsConstructor;

@NoArgsConstructor
public class MyMath {
    public static boolean checker(PerformOperation p, int num) {
        return p.check(num);
    }
}
