package com.thekirschners.jsonvsproto.benchmark.states;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.thekirschners.jsonvsproto.json.data.LongNamesStrings;
import com.thekirschners.jsonvsproto.json.factories.LongNamesStringsCollectionsFactory;
import org.openjdk.jmh.annotations.Level;
import org.openjdk.jmh.annotations.Scope;
import org.openjdk.jmh.annotations.Setup;
import org.openjdk.jmh.annotations.State;

import java.util.List;

@State(Scope.Benchmark)
public class LongNamesStringsJsonBenchmarkState {
    public List<LongNamesStrings> collection;

    public ObjectMapper objectMapper;

    public byte[] serializedCollection;

    public TypeReference<List<LongNamesStrings>> typeReference = new TypeReference<>() {
    };

    @Setup(Level.Invocation)
    public void setUp() throws JsonProcessingException {
        objectMapper = new ObjectMapper();
        collection = new LongNamesStringsCollectionsFactory().factor(Constants.COLLECTION_SIZE);
        serializedCollection = objectMapper.writeValueAsBytes(collection);
    }
}
