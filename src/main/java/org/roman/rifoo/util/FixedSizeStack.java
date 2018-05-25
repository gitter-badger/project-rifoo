package org.roman.rifoo.util;

public class FixedSizeStack<T> {
    private Object[] elements;
    private int index;

    public FixedSizeStack(int length) {
        elements = new Object[length];
    }

    public void push(T obj) {
        elements[index++] = obj;
    }

    public T pop() {
        return (T) elements[index--];
    }

    public T get() {
        return (T) elements[index];
    }
}
