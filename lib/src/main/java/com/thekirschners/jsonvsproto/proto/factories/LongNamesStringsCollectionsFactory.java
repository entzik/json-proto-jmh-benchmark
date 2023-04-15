package com.thekirschners.jsonvsproto.proto.factories;

import com.thekirschners.jsonvsproto.factories.CollectionFactory;
import com.thekirschners.jsonvsproto.proto.LongNamesNumbers;
import com.thekirschners.jsonvsproto.proto.LongNamesNumbersList;
import com.thekirschners.jsonvsproto.proto.LongNamesStrings;
import com.thekirschners.jsonvsproto.proto.LongNamesStringsList;

import java.util.List;
import java.util.stream.LongStream;

import static java.lang.Math.random;

public class LongNamesStringsCollectionsFactory {
    public LongNamesStringsList buildList(long size) {
        List<LongNamesStrings> longNamesNumbers = LongStream.range(0, size).mapToObj(l -> LongNamesStrings.newBuilder()
                .setLongName1("blabla-1-" + l)
                .setLongName2("blabla-2-" + l)
                .setLongName3("blabla-3-" + l)
                .setLongName4("blabla-4-" + l)
                .setLongName5("blabla-5-" + l)
                .build()).toList();
        return LongNamesStringsList.newBuilder().addAllElements(longNamesNumbers).build();
    }
}
