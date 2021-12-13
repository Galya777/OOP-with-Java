package com.example.spirals;

import javafx.fxml.FXML;
import javafx.scene.control.Label;

import java.awt.*;
import javax.swing.JPanel;

public class SpiralController extends JPanel {
    @FXML
    private Label welcomeText;
    private int choice;

    public SpiralController(int userChoice) {
        choice = userChoice;
    }

    public void paintComponent(Graphics g) {
        super.paintComponent(g);
        final int DELTA = 1;
        final int ARC_ANGLE = 20;
        final int PREF_W = 300;
        final int PREF_H = PREF_W;
        final int LOOP_MAX = 400;
        switch (choice) {
                case 1 -> // draw rectangle
                super.paintComponent(g);
                Graphics2D g2d = (Graphics2D) g;
                g2d.setRenderingHint(RenderingHints.KEY_ANTIALIASING,
                        RenderingHints.VALUE_ANTIALIAS_ON);

                g2d.setRenderingHint(RenderingHints.KEY_RENDERING,
                        RenderingHints.VALUE_RENDER_QUALITY);

                int x = getWidth() / 2;
                int y = getHeight() / 2;
                for (int i = 0; i < 8; i++) {

                    int t = i * 20;
                    g2d.drawLine(x + t, y + t, x + t, y + 20 + t);
                    g2d.drawLine(x + t, y + 20 + t, x - 20 - t, y + 20 + t);
                    g2d.drawLine(x - 20 - t, y + 20 + t, x - 20 - t, y - 20 - t);
                    g2d.drawLine(x - 20 - t, y - 20 - t, x + 20 + t, y - 20 - t);
                    g2d.drawLine(x + 20 + t, y - 20 - t, x + 20 + t, y + 20 + t);
                }
                case 2 -> { // draw circle
                    int x1 = PREF_W / 2;
                    int y1 = PREF_H / 2;
                    int width = 1;
                    int height = 1;
                    int startAngle = 0;
                    int arcAngle = ARC_ANGLE;
                    for (int i = 0; i < LOOP_MAX; i++) {
                        g.drawArc(x1, y1, width, height, startAngle, arcAngle);
                        x1 = x1 - DELTA;
                        y1 = y1 - DELTA;
                        width += 2 * DELTA;
                        height += 2 * DELTA;
                        startAngle = startAngle - arcAngle;
                    }
                    }
                }
        }
    }

