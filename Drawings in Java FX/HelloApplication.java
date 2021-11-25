package com.example.homework2;

import javafx.application.Application;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.control.TextInputDialog;
import javafx.scene.paint.Color;
import javafx.scene.shape.Line;
import javafx.stage.Stage;

import javax.swing.*;

public class HelloApplication {

    public static void main(String[] args) {
        String input = JOptionPane.showInputDialog("Enter 1 to draw multiple lines\n" +
                        "Enter 2 to daw a nest");
        int choice = Integer.parseInt(input);
        HelloController panel = new HelloController( choice );

        JFrame application = new JFrame(); // creates a new JFrame

        application.setDefaultCloseOperation( JFrame.EXIT_ON_CLOSE );
        application.add( panel ); // add the panel to the frame
        application.setSize( 300, 300 ); // set the desired size
        application.setVisible( true ); // show the frame
    }
}