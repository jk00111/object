package com.example.variance.contravariant;

import java.util.Arrays;
import java.util.Collection;

public class ContravariantList<T> {

    Object[] elements = new Object[5];
    int idx = 0;

    public ContravariantList(Collection<? extends T> in) {
        for (T elem : in) {
            elements[idx++] = elem;
        }
    }

    public void clone(Collection<? super T> out) {
        for (Object elem : elements) {
            out.add((T) elem);
        }
    }

    @Override
    public String toString() {
        return Arrays.toString(elements);
    }
}
