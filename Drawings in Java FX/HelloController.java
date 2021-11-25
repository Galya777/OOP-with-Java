package com.example.homework2;

import javafx.fxml.FXML;
import javafx.scene.control.Label;
import javafx.scene.shape.HLineTo;
import java.awt.Graphics;
import javax.swing.JPanel;

public class HelloController extends JPanel {
    @FXML
    private Label welcomeText;
    private int choice;
    public HelloController( int userChoice )
    {
        choice = userChoice;
    }
    public void paintComponent( Graphics g )
    {
        super.paintComponent( g );

        for ( int i = 0; i < 20; i++ )
        {
            switch (choice) {
                case 1 -> // draw lines
                        g.drawLine(0, 0, 10 + i * 20, 200);
                case 2 -> { // draw net
                    g.drawLine(0, 0, 10 + i * 20, 200);
                    g.drawOval(0, 200, 10 + 20 * i, i * 10);
                    ;
                }
            }
        }
    }
}