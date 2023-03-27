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


        JPanel panel = new JPanel();
        drawGameField(panel);


        frame.setVisible(true);
    }

    public void drawGameField(JPanel panel){
        int rows = frame.getHeight() / squareSize;
        int cols = frame.getWidth() / squareSize;
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                panel.setPreferredSize(new Dimension(squareSize, squareSize));
                frame.add(panel);
            }
        }
    }

    @Override
    protected void paintComponent(Graphics g) {
        super.paintComponent(g);
        g.setColor(Color.BLACK);
        g.fillRect(0, 0, getWidth(), getHeight());
    }

}
