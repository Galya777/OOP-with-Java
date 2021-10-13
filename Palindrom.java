package zad1.Zad2;

import java.util.Scanner;

public class Palindrom {
    public static void main(String[] args) {
        Scanner input =new Scanner(System.in);
        int number;
        System.out.println("Enter a 5-digit number: ");
        number=input.nextInt();
        int originalNumber = number;

        if(number>9999&&number<100000){
            int last = number%10;
            number=number/10;
            int fourth= number%10;
            number=number/10;
            int third= number%10;
            number=number/10;
            int second = number%10;
            int first= number/10;

            String result;
            if(first==last&&second==fourth){
                result =String.format("The number %d is palindrom.",originalNumber);
            } else{
                result =String.format("The number %d is NOT palindrom.",originalNumber);
            }
            System.out.println(result);
        } else {
            System.out.println("This is not a 5-digit number");
        }
    }
}
