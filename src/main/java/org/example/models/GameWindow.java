package org.example.models;

import javax.swing.*;
import java.awt.*;

public class GameWindow extends JPanel {

    private final JFrame frame = new JFrame("Game");
    private final int squareSize = 50;

    public GameWindow() {
        JFrame.setDefaultLookAndFeelDecorated(true);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(600, 600);


        int rows = frame.getHeight() / squareSize;
        int cols = frame.getWidth() / squareSize;

        JPanel panel = new JPanel(new GridLayout(rows, cols));
        panel.setBorder(BorderFactory.createEmptyBorder(10, 10, 10, 10));
        panel.setPreferredSize(new Dimension(cols * squareSize, rows * squareSize));

        for (int i = 0; i < rows * cols; i++) {
            JPanel cell = new JPanel();
            cell.setBorder(BorderFactory.createLineBorder(Color.BLACK));
            panel.add(cell);
        }

        frame.add(panel);
        frame.pack();
        frame.setVisible(true);
    }

    @Override
    protected void paintComponent(Graphics g) {
        super.paintComponent(g);
        g.setColor(Color.BLACK);
        g.fillRect(0, 0, getWidth(), getHeight());
    }

}
