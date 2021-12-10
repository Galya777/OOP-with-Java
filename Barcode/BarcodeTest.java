package zad4;

import java.util.Scanner;

public class BarcodeTest {
   static Scanner input = new Scanner(System.in);
    public static void main(String[] args) {
        int number;
        System.out.println("Enter a three digit number: ");
        number= input.nextInt();
        Barcode barcode= new Barcode(number);
        barcode.printBarcode();
    }
}
