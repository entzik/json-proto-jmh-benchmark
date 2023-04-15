package com.thekirschners.jsonvsproto.benchmark.states;

import com.thekirschners.jsonvsproto.proto.ShortNamesNumbersList;
import com.thekirschners.jsonvsproto.proto.factories.ShortNamesNumbersCollectionsFactory;
import org.openjdk.jmh.annotations.Level;
import org.openjdk.jmh.annotations.Scope;
import org.openjdk.jmh.annotations.Setup;
import org.openjdk.jmh.annotations.State;


@State(Scope.Benchmark)
public class ShortNamesNumbersProtoBenchmarkState {
    public ShortNamesNumbersList collection;

    public byte[] serializedCollection;

    @Setup(Level.Invocation)
    public void setUp() {
        collection = new ShortNamesNumbersCollectionsFactory().buildList(Constants.COLLECTION_SIZE);
        serializedCollection = collection.toByteArray();
    }
}
