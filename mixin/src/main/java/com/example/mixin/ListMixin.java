package com.example.mixin;

import java.util.List;

public interface ListMixin<T> extends List<T> {

    List<T> getRecords();

    default int size() {
        return getRecords().size();
    }

    default boolean isEmpty() {
        return getRecords().isEmpty();
    }
}
