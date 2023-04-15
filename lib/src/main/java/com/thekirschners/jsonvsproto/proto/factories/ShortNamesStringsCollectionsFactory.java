package com.thekirschners.jsonvsproto.proto.factories;

import com.thekirschners.jsonvsproto.factories.CollectionFactory;
import com.thekirschners.jsonvsproto.proto.LongNamesStrings;
import com.thekirschners.jsonvsproto.proto.LongNamesStringsList;
import com.thekirschners.jsonvsproto.proto.ShortNamesStrings;
import com.thekirschners.jsonvsproto.proto.ShortNamesStringsList;

import java.util.List;
import java.util.stream.LongStream;

public class ShortNamesStringsCollectionsFactory {
    public ShortNamesStringsList buildList(long size) {
        List<ShortNamesStrings> shortNamesStrings = LongStream.range(0, size).mapToObj(l -> ShortNamesStrings.newBuilder()
                .setSn1("blabla-1-" + l)
                .setSn2("blabla-2-" + l)
                .setSn3("blabla-3-" + l)
                .setSn4("blabla-4-" + l)
                .setSn5("blabla-5-" + l)
                .build()).toList();
        return ShortNamesStringsList.newBuilder().addAllElements(shortNamesStrings).build();
    }
}
