package com.thekirschners.jsonvsproto;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.thekirschners.jsonvsproto.json.data.*;

public class PayloadSizeReporter {
    public static void main(String[] args) throws JsonProcessingException {
        ObjectMapper om = new ObjectMapper();
        int shortNamesNumbersJsonSize = om.writeValueAsBytes(new ShortNamesNumbers(8984.902345, 8985.902345, 8986.902345, 8987.902345, 8988.902345)).length;
        int longNamesNumbersJsonSize = om.writeValueAsBytes(new LongNamesNumbers(8984.902345, 8985.902345, 8986.902345, 8987.902345, 8988.902345)).length;
        int shortNamesStringsJsonSize = om.writeValueAsBytes(new ShortNamesStrings("blabla-1-" + 1, "blabla-2-" + 1, "blabla-3-" + 1, "blabla-4-" + 1, "blabla-5-" + 1)).length;
        int longNamesStringsJsonSize = om.writeValueAsBytes(new LongNamesStrings("blabla-1-" + 1, "blabla-2-" + 1, "blabla-3-" + 1, "blabla-4-" + 1, "blabla-5-" + 1)).length;
        int shortNamesNumbersProtoSize = com.thekirschners.jsonvsproto.proto.ShortNamesNumbers.newBuilder().setSn1(8984.902345).setSn2(8985.902345).setSn3(8986.902345).setSn4(8987.902345).setSn5(8988.902345).build().toByteArray().length;
        int longtNamesNumbersProtoSize = com.thekirschners.jsonvsproto.proto.LongNamesNumbers.newBuilder().setLongName1(8984.902345).setLongName2(8985.902345).setLongName3(8986.902345).setLongName4(8987.902345).setLongName5(8988.902345).build().toByteArray().length;
        int shortNamesStringsProtoSize = com.thekirschners.jsonvsproto.proto.ShortNamesStrings.newBuilder().setSn1("blabla-1-" + 1).setSn2("blabla-2-" + 1).setSn3("blabla-3-" + 1).setSn4("blabla-4-" + 1).setSn5("blabla-5-" + 1).build().toByteArray().length;
        int longtNamesStringsProtoSize = com.thekirschners.jsonvsproto.proto.LongNamesStrings.newBuilder().setLongName1("blabla-1-" + 1).setLongName2("blabla-2-" + 1).setLongName3("blabla-3-" + 1).setLongName4("blabla-4-" + 1).setLongName5("blabla-5-" + 1).build().toByteArray().length;

        System.out.println("longtNamesNumbersProtoSize = " + longtNamesNumbersProtoSize);
        System.out.println("longNamesNumbersJsonSize = " + longNamesNumbersJsonSize);
        System.out.println();
        System.out.println("shortNamesNumbersProtoSize = " + shortNamesNumbersProtoSize);
        System.out.println("shortNamesNumbersJsonSize = " + shortNamesNumbersJsonSize);
        System.out.println();
        System.out.println("longtNamesStringsProtoSize = " + longtNamesStringsProtoSize);
        System.out.println("longNamesStringsJsonSize = " + longNamesStringsJsonSize);
        System.out.println();
        System.out.println("shortNamesStringsProtoSize = " + shortNamesStringsProtoSize);
        System.out.println("shortNamesStringsJsonSize = " + shortNamesStringsJsonSize);
    }
}
