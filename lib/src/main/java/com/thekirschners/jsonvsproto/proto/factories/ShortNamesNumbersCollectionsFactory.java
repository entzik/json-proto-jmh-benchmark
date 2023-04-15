package com.thekirschners.jsonvsproto.proto.factories;

import com.thekirschners.jsonvsproto.factories.CollectionFactory;
import com.thekirschners.jsonvsproto.proto.LongNamesNumbers;
import com.thekirschners.jsonvsproto.proto.LongNamesNumbersList;
import com.thekirschners.jsonvsproto.proto.ShortNamesNumbers;
import com.thekirschners.jsonvsproto.proto.ShortNamesNumbersList;

import java.util.List;
import java.util.stream.LongStream;

public class ShortNamesNumbersCollectionsFactory {
    public ShortNamesNumbersList buildList(long size) {
        List<ShortNamesNumbers> shortNamesNumbers = LongStream.range(0, size).mapToObj(l -> ShortNamesNumbers.newBuilder()
                .setSn1(8984.902345)
                .setSn2(8985.902345)
                .setSn3(8986.902345)
                .setSn4(8987.902345)
                .setSn5(8988.902345)
                .build()).toList();
        return ShortNamesNumbersList.newBuilder().addAllElements(shortNamesNumbers).build();
    }
}
