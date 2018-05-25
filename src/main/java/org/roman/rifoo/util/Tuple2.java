package org.roman.rifoo.util;

public class Tuple2<A, B> {
    public final A a;
    public final B b;

    public Tuple2(A a, B b) {
        this.a = a;
        this.b = b;
    }

    public String toString() {
        return String.format("(%s, %s)", a, b);
    }
}
