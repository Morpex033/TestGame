package org.example.scripts;

import org.example.models.GameWindow;

import javax.swing.*;
import java.awt.*;

public class DrawGameField extends JPanel {
    private final int squareSize = 50;

    @Override
    protected void paintComponent(Graphics g) {
        super.paintComponent(g);
        g.setColor(Color.BLACK);
        g.fillRect(0, 0, getWidth(), getHeight());
    }

    public DrawGameField(JFrame frame){
        int rows = frame.getHeight() / squareSize;
        int cols = frame.getWidth() / squareSize;
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                JPanel panel = new JPanel();
                panel.setPreferredSize(new Dimension(squareSize, squareSize));
                frame.add(panel);
            }
        }

        frame.setLayout(new java.awt.GridLayout(rows, cols));
    }
}
