package com.thekirschners.jsonvsproto.json.factories;

import com.thekirschners.jsonvsproto.factories.CollectionFactory;
import com.thekirschners.jsonvsproto.json.data.LongNamesNumbers;

public class LongNamesNumbersCollectionsFactory implements CollectionFactory<LongNamesNumbers> {
    @Override
    public LongNamesNumbers buildObject(long l) {
        return new LongNamesNumbers(8984.902345, 8985.902345, 8986.902345, 8987.902345, 8988.902345);
    }
}
