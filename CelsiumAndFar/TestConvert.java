package task1;

import java.util.Scanner;

public class TestConvert {
    public static void main(String[] args) {
        Scanner input= new Scanner(System.in);
        double celsius= input.nextDouble();
        double fahrenheit=input.nextDouble();
        Celsius cel= new Celsius(celsius);
        Fahrenheit fahr=new Fahrenheit(fahrenheit);
System.out.println(cel.convertToFahrenheit());
System.out.println(fahr.convertToCelsius());
    }
}
