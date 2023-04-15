package com.thekirschners.jsonvsproto.benchmark;

import com.thekirschners.jsonvsproto.benchmark.states.*;
import com.thekirschners.jsonvsproto.proto.LongNamesNumbers;
import com.thekirschners.jsonvsproto.proto.LongNamesStrings;
import com.thekirschners.jsonvsproto.proto.ShortNamesNumbers;
import com.thekirschners.jsonvsproto.proto.ShortNamesStrings;
import org.openjdk.jmh.annotations.Benchmark;
import org.openjdk.jmh.annotations.BenchmarkMode;
import org.openjdk.jmh.annotations.Mode;
import org.openjdk.jmh.infra.Blackhole;

import java.io.IOException;

public class CodecBenchmark {
    ///////////////////////////////////
    ///// JSON serialization benchmarks

    @Benchmark
    @BenchmarkMode(Mode.Throughput)
    public void benchmarkJsonEncodeShortNamesNumbers(ShortNamesNumbersJsonBenchmarkState state, Blackhole bh) throws IOException {
        bh.consume(state.objectMapper.writeValueAsBytes(state.collection));
    }

    @Benchmark
    @BenchmarkMode(Mode.Throughput)
    public void benchmarkJsonEncodeLongNamesNumbers(LongNamesNumbersJsonBenchmarkState state, Blackhole bh) throws IOException {
        bh.consume(state.objectMapper.writeValueAsBytes(state.collection));
    }

    @Benchmark
    @BenchmarkMode(Mode.Throughput)
    public void benchmarkJsonEncodeShortNamesStrings(ShortNamesStringsJsonBenchmarkState state, Blackhole bh) throws IOException {
        bh.consume(state.objectMapper.writeValueAsBytes(state.collection));
    }

    @Benchmark
    @BenchmarkMode(Mode.Throughput)
    public void benchmarkJsonEncodeLongNamesStrings(LongNamesStringsJsonBenchmarkState state, Blackhole bh) throws IOException {
        bh.consume(state.objectMapper.writeValueAsBytes(state.collection));
    }

    ///////////////////////////////////
    ///// JSON deserialization benchmarks
    @Benchmark
    @BenchmarkMode(Mode.Throughput)
    public void benchmarkJsonDecodeShortNamesNumbers(ShortNamesNumbersJsonBenchmarkState state, Blackhole bh) throws IOException {
        bh.consume(state.objectMapper.readValue(state.serializedCollection, state.typeReference));
    }

    @Benchmark
    @BenchmarkMode(Mode.Throughput)
    public void benchmarkJsonDecodeLongNamesNumbers(LongNamesNumbersJsonBenchmarkState state, Blackhole bh) throws IOException {
        bh.consume(state.objectMapper.readValue(state.serializedCollection, state.typeReference));
    }

    @Benchmark
    @BenchmarkMode(Mode.Throughput)
    public void benchmarkJsonDecodeShortNamesStrings(ShortNamesStringsJsonBenchmarkState state, Blackhole bh) throws IOException {
        bh.consume(state.objectMapper.readValue(state.serializedCollection, state.typeReference));
    }

    @Benchmark
    @BenchmarkMode(Mode.Throughput)
    public void benchmarkJsonDecodeLongNamesStrings(LongNamesStringsJsonBenchmarkState state, Blackhole bh) throws IOException {
        bh.consume(state.objectMapper.readValue(state.serializedCollection, state.typeReference));
    }

    ///////////////////////////////////
    ///// PROTO deserialization benchmarks
    @Benchmark
    @BenchmarkMode(Mode.Throughput)
    public void benchmarkProtoDecodeShortNamesNumbers(ShortNamesNumbersProtoBenchmarkState state, Blackhole bh) throws IOException {
        bh.consume(ShortNamesNumbers.parseFrom(state.serializedCollection));
    }

    @Benchmark
    @BenchmarkMode(Mode.Throughput)
    public void benchmarkProtoDecodeLongNamesNumbers(LongNamesNumbersProtoBenchmarkState state, Blackhole bh) throws IOException {
        bh.consume(LongNamesNumbers.parseFrom(state.serializedCollection));
    }

    @Benchmark
    @BenchmarkMode(Mode.Throughput)
    public void benchmarkProtoDecodeShortNamesStrings(ShortNamesStringsProtoBenchmarkState state, Blackhole bh) throws IOException {
        bh.consume(ShortNamesStrings.parseFrom(state.serializedCollection));
    }

    @Benchmark
    @BenchmarkMode(Mode.Throughput)
    public void benchmarkProtoDecodeLongNamesStrings(LongNamesStringsProtoBenchmarkState state, Blackhole bh) throws IOException {
        bh.consume(LongNamesStrings.parseFrom(state.serializedCollection));
    }

    ///////////////////////////////////
    ///// PROTO serialization benchmarks
    @Benchmark
    @BenchmarkMode(Mode.Throughput)
    public void benchmarkProtoEncodeShortNamesNumbers(ShortNamesNumbersProtoBenchmarkState state, Blackhole bh) throws IOException {
        bh.consume(state.collection.toByteArray());
    }

    @Benchmark
    @BenchmarkMode(Mode.Throughput)
    public void benchmarkProtoEncodeLongNamesNumbers(LongNamesNumbersProtoBenchmarkState state, Blackhole bh) throws IOException {
        bh.consume(state.collection.toByteArray());
    }

    @Benchmark
    @BenchmarkMode(Mode.Throughput)
    public void benchmarkProtoEncodeShortNamesStrings(ShortNamesStringsProtoBenchmarkState state, Blackhole bh) throws IOException {
        bh.consume(state.collection.toByteArray());
    }

    @Benchmark
    @BenchmarkMode(Mode.Throughput)
    public void benchmarkProtoEncodeLongNamesStrings(LongNamesStringsProtoBenchmarkState state, Blackhole bh) throws IOException {
        bh.consume(state.collection.toByteArray());
    }
}
