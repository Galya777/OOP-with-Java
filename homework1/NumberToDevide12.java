package zad1;

import java.util.Scanner;


public class NumberToDevide12 {

    public static void main(String[] args) {

        Scanner input= new Scanner(System.in);

        int number;
        int numMod12=0;
        int totalNumber=0;
        double probability;

        for (int i = 3; i < 9; i++) {
            for (int j = 2; j < 8; j++) {
                for (int k = 4; k < 9; k++) {
                    for (int l = 1; l < 6; l++) {
                        for (int m = 6; m < 9; m++) {
                            number = m + l * 10 + k * 100 + j * 1000 + i * 10000;
                            totalNumber++;
                            if (number % 4 == 0) numMod12++;

                        }
                    }
                }
            }
        }
         probability= (double) numMod12/totalNumber;

        System.out.println("Total numbers: "+totalNumber);
        System.out.println("By MOD 12 numbers: " + numMod12);
        System.out.println("Probability: "+ String.format(String.valueOf(probability),4));



    }
}
