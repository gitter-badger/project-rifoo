package org.roman.rifoo;

import org.junit.Test;
import org.roman.rifoo.ui.BlockCanvas;

import java.awt.*;

public class TestBCanvas {

    @Test
    public void testBlockCanvas() {
        BlockCanvas cvs = new BlockCanvas(10);
        cvs.equals(null);
        cvs.getGridHeight();
        cvs.getGridSize();
        cvs.getGridWidth();
        cvs.getMATRIX();
        cvs.isShowBorder();
        cvs.setColor(0,0, Color.BLACK);
        cvs.getColor(1,1);
        cvs.paintComponent(null);
    }
}
