package task2;

import javax.swing.*;

public class ComplexNumbersTest {
    public static void main(String[] args) {
        String input = JOptionPane.showInputDialog("Enter the real and imaginary part of your number");
        double real= Double.parseDouble(input);
        double imaginary= Double.parseDouble(input);
        ComplexNumbers complex= new ComplexNumbers(real, imaginary);
        System.out.printf("Angle: %.2f\n",complex.getAngle());
        System.out.printf("Magnitude: %.2f\n",complex.getMagnitude());


        JFrame application = new JFrame(); // creates a new JFrame

        application.setDefaultCloseOperation( JFrame.EXIT_ON_CLOSE );
        application.setSize( 300, 300 ); // set the desired size
        application.setVisible( true ); // show the frame
    }
}
