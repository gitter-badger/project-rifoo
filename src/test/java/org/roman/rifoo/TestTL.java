package org.roman.rifoo;

import org.junit.Test;
import org.roman.rifoo.util.TupleList;

public class TestTL {

    @Test
    public void testTupleList() {
        TupleList<Integer, String> list = new TupleList<>();
        list.add(7, "7");
        list.add(15, "15");
        list.forEach(System.out::println);
    }
}
