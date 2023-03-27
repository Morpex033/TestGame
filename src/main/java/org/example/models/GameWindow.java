package org.example.models;

import org.example.scripts.DrawGameField;

import javax.swing.*;

public class GameWindow extends JPanel {

    private final JFrame frame = new JFrame("Game");
    private boolean isReady = false;
    public GameWindow(){
        JFrame.setDefaultLookAndFeelDecorated(true);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(600,600);


            new DrawGameField(frame);


        frame.setVisible(true);
    }

}
