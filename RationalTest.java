package task3;

import java.util.Scanner;

public class RationalTest {

    public static void main(String[] args) {
        Scanner input= new Scanner(System.in);
        int num, den;
        System.out.println("Enter your numerator: ");
        num=input.nextInt();
        System.out.println("Enter your denominator: ");
        den=input.nextInt();
        Rational rational=new Rational(num, den);
        System.out.println("Enter another numerator: ");
        num=input.nextInt();
        System.out.println("Enter another denominator: ");
        den=input.nextInt();
        Rational another=new Rational(num, den);

        System.out.printf("Sum %s\n",rational.sum(another));

        System.out.printf("Subtraction %s\n",rational.subtract(another));

        System.out.printf("Product %s\n",rational.multiply(another));

        System.out.printf("Divide %s\n",rational.divide(another));


    }
}
