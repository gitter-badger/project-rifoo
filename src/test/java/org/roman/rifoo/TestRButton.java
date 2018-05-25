package org.roman.rifoo;

import org.junit.Test;
import org.roman.rifoo.ui.RectButton;

import javax.swing.*;

public class TestRButton {

    @Test
    public void testRectButton() {
        RectButton btn = new RectButton("Hello");
        JFrame frame = new JFrame();
        btn.setSize(100, 100);
        frame.add(btn);
        frame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        frame.pack();
        frame.setVisible(true);
        btn.getBorderColor();
        btn.getDefaultState();
        btn.getNow();
        btn.getOnClick();
        btn.getOnEnter();
    }
}
