package org.roman.rifoo;

import org.junit.Test;
import org.roman.rifoo.util.*;

import java.io.IOException;
import java.util.Random;

public class TestUtil {

    @Test
    public void testProcesses() throws IOException {
        Processes.exec("java --version", System.out, System.err, System.in);
    }

    @Test
    public void testMoreList() {
        MoreList<Integer> list = new ArrayList<>();
        for (int i = 0; i < 1000; i++) {
            list.addRandom(new Random().nextInt(1500));
            System.out.println(list.select());
        }
        list.forEach(System.out::println);
    }

    @Test
    public void testStack() {
        Stack s = new LinkedStack();
        s.push(null);
        s.push(new Object());
        ((LinkedStack) s).forEach(System.out::println);
    }

    @Test
    public void testConvertor() {
        ConvertTo.chars(new String().getBytes());
        ConvertTo.obj("Hello, World!!!!! ~!@#$%^&*()_+".getBytes());
        ConvertTo.prim(152);
        ConvertTo.prim("".toCharArray());
        ConvertTo.prim(new Byte[]{15, 25, 35, 45});
        ConvertTo.string("");
        ConvertTo.string(new byte[]{32, 32, 32, 32});
        ConvertTo.string(new char[]{' ','\u0000'});
    }
}
