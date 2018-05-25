package org.roman.rifoo;

import org.junit.Test;
import org.roman.rifoo.util.Tuple2;
import org.roman.rifoo.util.Tuple3;

import static org.junit.Assert.*;


public class TestTuples {

    @Test
    public void testTuple2() {
        Tuple2<Integer, String> t = new Tuple2<>(7, "x");
        assertNotNull(t.b);
        assertNotNull(t.a);
        System.out.println(t);
        System.out.println(t.a);
        System.out.println(t.b);
    }

    @Test
    public void testTuple3() {
        Tuple3<Integer, String, Object> t = new Tuple3<>(7, "x", null);
        assertNotNull(t.a);
        assertNotNull(t.b);
        assertNull(t.c);
        System.out.println(t);
        System.out.println(t.a);
        System.out.println(t.b);
        System.out.println(t.c);
    }
}
