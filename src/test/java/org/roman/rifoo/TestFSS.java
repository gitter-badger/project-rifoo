package org.roman.rifoo;

import org.junit.Test;
import org.roman.rifoo.util.FixedSizeStack;
import static org.junit.Assert.*;

public class TestFSS {


    @Test
    public void testPush() {
        FixedSizeStack<Integer> stack = new FixedSizeStack<>(10);
        for (int i = 0; i < 10; ++i) {
            stack.push(i);
        }
    }

    @Test
    public void testPop() {
        FixedSizeStack<Integer> stack = new FixedSizeStack<>(10);
        for (int i = 0; i < 10; ++i) {
            stack.push(i);
        }
        for (int i = 0; i < 5; ++i) {
            System.out.println(stack.pop());
        }
    }
}
