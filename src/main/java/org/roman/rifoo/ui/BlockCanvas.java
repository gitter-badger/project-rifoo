package org.roman.rifoo.ui;

import lombok.Data;

import javax.swing.*;
import java.awt.*;

@Data
public class BlockCanvas extends JPanel {

    private Color[][] MATRIX = new Color[10][10];
    private final int gridWidth, gridHeight;
    private int gridSize = 10;
    private boolean showBorder = true;

    public void setColor(int x, int y, Color c) {
        MATRIX[y][x] = c;
    }

    public Color getColor(int x, int y) {
        return MATRIX[y][x];
    }

    public BlockCanvas(int width, int height) {
        MATRIX = new Color[height][width];
        this.gridHeight = height;
        this.gridWidth = width;
    }

    public BlockCanvas(int sideWidth) {
        this(sideWidth, sideWidth);
    }

    public void paintComponent(Graphics g) {
        if (g == null) return;
        g.setColor(Color.BLACK);
        g.fillRect(0, 0, getWidth(), getHeight());
        for (int i = 0; i < gridWidth; i++)
            for (int j = 0; j < gridHeight; j++) {
                int x = i * gridSize;
                int y = j * gridSize;
                g.setColor(MATRIX[y][x]);
                g.fillRect(x, y, gridSize, gridSize);
            }
    }
}
