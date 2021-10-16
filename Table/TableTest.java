package zad2;

import javax.swing.*;

public class TableTest {
    public static void main(String[] args) {
        double a, b;
        int step;
        String aText= JOptionPane.showInputDialog("Enter the left endpoint of interval:");
                a= Double.parseDouble(aText);
        String bText= JOptionPane.showInputDialog("Enter the right endpoint of interval:");
        b= Double.parseDouble(bText);
        String stepText= JOptionPane.showInputDialog("Enter the left endpoint of interval:");
        step= Integer.parseInt(stepText);

        if(a>b){
    double temp=a;
      a=b;
    b=temp;

        }
        Table table= new Table(a, b, step);
        table.makeTable();
    }
}
