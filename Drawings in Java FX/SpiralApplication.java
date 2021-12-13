package com.example.spirals;

import javax.swing.*;

public class SpiralApplication {

    public static void main(String[] args) {
        String input = JOptionPane.showInputDialog("Enter 1 to draw rectangle\n" +
                "Enter 2 to daw a circle");
        int choice = Integer.parseInt(input);
        SpiralController panel = new SpiralController( choice );

        JFrame application = new JFrame(); // creates a new JFrame

        application.setDefaultCloseOperation( JFrame.EXIT_ON_CLOSE );
        application.add( panel ); // add the panel to the frame
        application.setSize( 300, 300 ); // set the desired size
        application.setVisible( true ); // show the frame
    }
}