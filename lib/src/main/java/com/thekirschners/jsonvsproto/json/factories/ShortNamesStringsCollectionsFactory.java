package com.thekirschners.jsonvsproto.json.factories;

import com.thekirschners.jsonvsproto.factories.CollectionFactory;
import com.thekirschners.jsonvsproto.json.data.ShortNamesStrings;

public class ShortNamesStringsCollectionsFactory implements CollectionFactory<ShortNamesStrings> {
    @Override
    public ShortNamesStrings buildObject(long l) {
        return new ShortNamesStrings("blabla-1-" + l, "blabla-2-" + l, "blabla-3-" + l, "blabla-4-" + l, "blabla-5-" + l);
    }
}
