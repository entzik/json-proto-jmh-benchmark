package com.thekirschners.jsonvsproto.benchmark.states;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.thekirschners.jsonvsproto.proto.LongNamesStringsList;
import com.thekirschners.jsonvsproto.proto.factories.LongNamesStringsCollectionsFactory;
import org.openjdk.jmh.annotations.Level;
import org.openjdk.jmh.annotations.Scope;
import org.openjdk.jmh.annotations.Setup;
import org.openjdk.jmh.annotations.State;


@State(Scope.Benchmark)
public class LongNamesStringsProtoBenchmarkState {
    public LongNamesStringsList collection;

    public byte[] serializedCollection;

    @Setup(Level.Invocation)
    public void setUp() {
        collection = new LongNamesStringsCollectionsFactory().buildList(Constants.COLLECTION_SIZE);
        serializedCollection = collection.toByteArray();
    }
}
