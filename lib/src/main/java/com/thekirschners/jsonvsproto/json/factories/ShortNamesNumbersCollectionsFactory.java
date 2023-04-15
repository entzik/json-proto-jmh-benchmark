package com.thekirschners.jsonvsproto.json.factories;

import com.thekirschners.jsonvsproto.factories.CollectionFactory;
import com.thekirschners.jsonvsproto.json.data.ShortNamesNumbers;
import com.thekirschners.jsonvsproto.json.data.ShortNamesStrings;

public class ShortNamesNumbersCollectionsFactory implements CollectionFactory<ShortNamesNumbers> {
    @Override
    public ShortNamesNumbers buildObject(long l) {
        return new ShortNamesNumbers(8984.902345, 8985.902345, 8986.902345, 8987.902345, 8988.902345);
    }
}
