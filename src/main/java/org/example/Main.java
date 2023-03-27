package org.example;

import org.example.models.GameWindow;

public class Main {
    public static void main(String[] args) {
        javax.swing.SwingUtilities.invokeLater(GameWindow::new);
    }
}