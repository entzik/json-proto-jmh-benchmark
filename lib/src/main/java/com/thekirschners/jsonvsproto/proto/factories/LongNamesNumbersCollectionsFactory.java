package com.thekirschners.jsonvsproto.proto.factories;

import com.thekirschners.jsonvsproto.factories.CollectionFactory;
import com.thekirschners.jsonvsproto.proto.LongNamesNumbers;
import com.thekirschners.jsonvsproto.proto.LongNamesNumbersList;

import java.util.List;
import java.util.stream.LongStream;

import static java.lang.Math.*;

public class LongNamesNumbersCollectionsFactory {
    public LongNamesNumbersList buildList(long size) {
        List<LongNamesNumbers> longNamesNumbers = LongStream.range(0, size).mapToObj(l -> LongNamesNumbers.newBuilder()
                .setLongName1(8984.902345)
                .setLongName2(8985.902345)
                .setLongName3(8986.902345)
                .setLongName4(8987.902345)
                .setLongName5(8988.902345)
                .build()).toList();
        return LongNamesNumbersList.newBuilder().addAllElements(longNamesNumbers).build();
    }
}
