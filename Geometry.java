package task4;

import javax.swing.*;
import java.awt.*;

public class Geometry {

    public void paintComponent( Graphics g ) {
        JFrame application = new JFrame(); // creates a new JFrame
        g.drawOval(150,150, 100,100);
        g.drawLine(0, 25, 100,100);



        application.setDefaultCloseOperation( JFrame.EXIT_ON_CLOSE );
        application.setSize( 300, 300 ); // set the desired size
        application.setVisible( true );
    }
}
