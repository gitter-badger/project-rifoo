package org.roman.rifoo;

import org.junit.Test;
import org.roman.rifoo.ui.CircleButton;

import javax.swing.*;

public class TestCButton {

    @Test
    public void testCircleButton() {
        CircleButton btn = new CircleButton("Hello");
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
