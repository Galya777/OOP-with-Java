package zad2;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Scanner;

public class DistinctNumbers {
    public static void main(String[] args) {
        Scanner input= new Scanner(System.in);
        ArrayList list= new ArrayList();

        //1 way
        int number;
        System.out.println("Enter number: ");
        number=input.nextInt();
        while(number!=0){
            if(!list.contains(number)){
                list.add(number);
            }
            System.out.println("Next number: ");
            number=input.nextInt();
        }
        // 2 way HashSet<Integer> set=new HashSet<>(list);
        System.out.println("Distinct number: "+list);

        //way
        System.out.println("Enter sequence of numbers: ");
        String line= input.nextLine();
        String[] numberString= line.split("\\s+|,\\s*");
        double[] numbers=new double[numberString.length];
        for(int i=0;i<numbers.length;++i) {
            numbers[i] = Double.parseDouble(numberString[i]);

            if (numbers[i] == 0) {
                System.out.println("Distinct number: " + list);
                System.exit(0);
            }
            if (!list.contains(number)) {
                list.add(number);
            }
        }
    }
}
