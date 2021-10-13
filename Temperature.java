package zad1;
import java.util.Scanner;
public class Temperature {
    public static void main(String[] args) {
      Scanner input= new Scanner(System.in);
      double celsius;
      double fahrenheit;
int option;
System.out.println("Enter1 For Fahrenheit to Celsius or 2 for Celsius to Fahrenheit");
   option=input.nextInt();
   if(option==1) {
       System.out.println("Enter temperature in Fahrenheit: ");
       fahrenheit = input.nextDouble();
       celsius = 5.0 / 9.0 * (fahrenheit - 32);
       System.out.printf("Temperature in Celsius: %.2f", celsius);
   } else if(option==2) {
       System.out.println("\nEnter temperature in Celsius: ");
       celsius = input.nextDouble();
       fahrenheit = 9.0 / 5.0 * celsius + 32;
       System.out.printf("\nTemperature in Fahrenheit: %.2f", fahrenheit);
   } else {
       System.out.println("Invalid choice!");
   }


    }
}
