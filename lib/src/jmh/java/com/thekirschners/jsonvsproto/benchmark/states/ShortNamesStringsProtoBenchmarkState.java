package com.thekirschners.jsonvsproto.benchmark.states;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.thekirschners.jsonvsproto.proto.ShortNamesStringsList;
import com.thekirschners.jsonvsproto.proto.factories.ShortNamesStringsCollectionsFactory;
import org.openjdk.jmh.annotations.Level;
import org.openjdk.jmh.annotations.Scope;
import org.openjdk.jmh.annotations.Setup;
import org.openjdk.jmh.annotations.State;


@State(Scope.Benchmark)
public class ShortNamesStringsProtoBenchmarkState {
    public ShortNamesStringsList collection;

    public byte[] serializedCollection;

    @Setup(Level.Invocation)
    public void setUp() {
        collection = new ShortNamesStringsCollectionsFactory().buildList(Constants.COLLECTION_SIZE);
        serializedCollection = collection.toByteArray();
    }
}
