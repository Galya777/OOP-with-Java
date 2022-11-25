package task4;

import java.util.Scanner;

public class SavingAccountTest {
    public static void main(String[] args) {
        Scanner input= new Scanner(System.in);
        int annual, balance;
        System.out.println("Enter your annual: ");
        annual=input.nextInt();
        System.out.println("Enter your balance: ");
        balance=input.nextInt();
        SavingsAccount acc1= new SavingsAccount(annual,balance);
        System.out.println("Enter another annual: ");
        annual=input.nextInt();
        System.out.println("Enter another balance: ");
        balance=input.nextInt();
        SavingsAccount acc2= new SavingsAccount(annual,balance);
        System.out.println(acc1.isGreater(acc2));
        SavingsAccount acc3= new SavingsAccount(acc2);
        System.out.println(acc3.isGreater(acc2));
    }
}
