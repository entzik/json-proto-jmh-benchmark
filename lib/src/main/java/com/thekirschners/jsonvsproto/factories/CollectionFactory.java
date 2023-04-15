package com.thekirschners.jsonvsproto.factories;

import java.util.List;
import java.util.stream.LongStream;

public interface CollectionFactory<T> {

    T buildObject(long l);

    default List<T> factor(long size) {
        return LongStream.range(0, size).mapToObj(this::buildObject).toList();
    }
}
