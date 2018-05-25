package org.roman.rifoo.util;

import java.util.ArrayList;
import java.util.Collection;

/**
 * Created by LINKOR on 26.12.2016 in 9:44.
 * Date: 2016.12.26
 */
public class TupleList<T, E> extends ArrayList<Tuple2<T, E>> {
    public TupleList(int initialCapacity) {
        super(initialCapacity);
    }

    public TupleList() {
        super();
    }

    public TupleList(Collection<Tuple2<T, E>> coll) {
        super(coll);
    }

    public TupleList(T[] ts, E[] es) {
        ArrayList<Tuple2<T, E>> list = new ArrayList<>();
        for (int i = 0; i < ts.length && i < es.length; i++) {
            list.add(new Tuple2<>(ts[i], es[i]));
        }
        addAll(list);
    }

    public void add(T t, E e) {
        super.add(new Tuple2<>(t, e));
    }
}
