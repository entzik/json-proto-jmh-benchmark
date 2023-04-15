package com.thekirschners.jsonvsproto.json.factories;

import com.thekirschners.jsonvsproto.factories.CollectionFactory;
import com.thekirschners.jsonvsproto.json.data.LongNamesStrings;
import com.thekirschners.jsonvsproto.json.data.ShortNamesStrings;

public class LongNamesStringsCollectionsFactory implements CollectionFactory<LongNamesStrings> {
    @Override
    public LongNamesStrings buildObject(long l) {
        return new LongNamesStrings("blabla-1-" + l, "blabla-2-" + l, "blabla-3-" + l, "blabla-4-" + l, "blabla-5-" + l);
    }
}
