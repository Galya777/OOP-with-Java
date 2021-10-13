package zad4;

import java.util.Scanner;

public class FourDecimal {
    public static void main(String[] args) {
        Scanner input= new Scanner(System.in);
        int number;
        System.out.println("Enter a 4-digit number: ");
        number=input.nextInt();
        int fourth=number%10;
        number/=10;
        int third= number%10;
        number/=10;
        int second=number%10;
        int first=number/10;

    }
}
