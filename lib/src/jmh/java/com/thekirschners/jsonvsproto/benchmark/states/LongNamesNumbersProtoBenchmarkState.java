package com.thekirschners.jsonvsproto.benchmark.states;

import com.thekirschners.jsonvsproto.proto.LongNamesNumbersList;
import com.thekirschners.jsonvsproto.proto.factories.LongNamesNumbersCollectionsFactory;
import org.openjdk.jmh.annotations.Level;
import org.openjdk.jmh.annotations.Scope;
import org.openjdk.jmh.annotations.Setup;
import org.openjdk.jmh.annotations.State;


@State(Scope.Benchmark)
public class LongNamesNumbersProtoBenchmarkState {
    public LongNamesNumbersList collection;

    public byte[] serializedCollection;

    @Setup(Level.Invocation)
    public void setUp() {
        collection = new LongNamesNumbersCollectionsFactory().buildList(Constants.COLLECTION_SIZE);
        serializedCollection = collection.toByteArray();
    }
}
