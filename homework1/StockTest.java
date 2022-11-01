package zad2;

import java.util.Scanner;

public class StockTest {
    public static void main(String[] args) {
        Scanner input= new Scanner(System.in);
        String name, symbol;
        double previous, current;
        System.out.println("Enter the name of the stock: ");
         name=input.next();
        System.out.println("Enter the symbol of the stock: ");
        symbol=input.next();
        System.out.println("Enter the previous price of the stock: ");
        previous=input.nextDouble();
        System.out.println("Enter the current price of the stock: ");
        current=input.nextDouble();
        Stock stock= new Stock(symbol, name);
        stock.setPreviousClothingPrice(previous);
        stock.setCurrentPRice(current);

        System.out.println("The percentage is: "+stock.changePercent());
    }
}
