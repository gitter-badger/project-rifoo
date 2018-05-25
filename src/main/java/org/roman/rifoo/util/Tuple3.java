package org.roman.rifoo.util;

public class Tuple3<A, B, C> extends Tuple2<A, B> {
    public final C c;
    public Tuple3(A a, B b, C c) {
        super(a, b);
        this.c = c;
    }

    public String toString() {
        return String.format("(%s, %s, %s)", a,b,c);
    }
}
