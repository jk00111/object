package com.example.variance.covariant;

import java.util.Arrays;
import java.util.Collection;

public class CovariantList<T> {

    Object[] elements = new Object[5];
    int idx = 0;

    public CovariantList(Collection<? extends T> in) {
        for (T elem : in) {
            elements[idx++] = elem;
        }
    }

    public void clone(Collection<T> out) {
        for (Object elem : elements) {
            out.add((T) elem);
        }
    }

    @Override
    public String toString() {
        return Arrays.toString(elements);
    }
}
