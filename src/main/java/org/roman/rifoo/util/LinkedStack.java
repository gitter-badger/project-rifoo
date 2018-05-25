package org.roman.rifoo.util;

import java.util.Iterator;

/**
 * Created by LINKOR on 11.11.2016 in 15:40.
 * Date: 2016.11.11
 */
public class LinkedStack<T> implements Iterable<T>, Stack<T> {
    @Override
    public Iterator<T> iterator() {
        return new Iterator<T>() {
            @Override
            public boolean hasNext() {
                return !(top.end());
            }

            @Override
            public T next() {
                return pop();
            }

            @Override
            public void remove() {
            }
        };
    }
    protected static class Node<U> {
        U item;
        Node<U> next;
        protected Node() {
            item = null;
            next = null;
        }
        protected Node(U item, Node<U> next) {
            this.item = item;
            this.next = next;
        }
        protected boolean end() {
            return item == null && next == null;
        }
    }
    private Node<T> top = new Node<T>();
    public void push(T item) {
        Node<T> top = this.top;
        this.top = new Node<>(item, top);
    }

    @Override
    public T[] removeAll() {
        top = new Node<>();
        return null;
    }

    @Override
    public T peek() {
        return top.item;
    }

    @Override
    public boolean empty() {
        return top.end();
    }

    public T pop() {
        T res = top.item;
        if (!top.end()) top = top.next;
        return res;
    }
}
