package org.roman.rifoo;

import org.junit.Test;
import org.roman.rifoo.util.LinkedStack;

import java.util.Random;

public class TestLS {

    @Test
    public void testLinkedStack() {
        LinkedStack<Integer> stack = new LinkedStack<>();
        stack.push(15);
        for (int i = 0; i < 150; ++i) {
            stack.push(Math.abs(new Random().nextInt()) + i);
        }
        stack.forEach(System.out::println);
    }
}
