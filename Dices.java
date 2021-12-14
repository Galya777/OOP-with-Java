package zad8;

import java.util.Random;

public class Dices {
    public static void main(String[] args) {
        Random rand = new Random();
        int[] sums = new int[36000];
        int sum2=0; int sum3=0; int sum4=0; int sum5=0; int sum6=0; int sum7=0; int sum8=0; int sum9=0;
        int sum10=0; int sum11=0; int sum12=0;

        for (int i = 0; i < 36000; ++i) {
            int dice1 = rand.nextInt(1, 6);
            int dice2 = rand.nextInt(1, 6);
             sums[i] = dice1 + dice2;
             switch (sums[i]){
                 case 2: sum2++;
                 case 3: sum3++;
                 case 4:  sum4++;
                 case 5: sum5++;
                 case 6: sum6++;
                 case 7: sum7++;
                 case 8: sum8++;
                 case 9: sum9++;
                 case 10: sum10++;
                 case 11: sum11++;
                 case 12: sum12++;
             }
        }
        System.out.printf("%s\t%s",2, sum2);
        System.out.printf("%s\t%s",3, sum3);
        System.out.printf("%s\t%s", 4, sum4);
        System.out.printf("%s\t%s", 5, sum5);
        System.out.printf("%s\t%s",6, sum6);
        System.out.printf("%s\t%s", 7, sum7);
        System.out.printf("%s\t%s", 8, sum8);
        System.out.printf("%s\t%s", 9, sum9);
        System.out.printf("%s\t%s",10, sum10);
        System.out.printf("%s\t%s",11, sum11);
        System.out.printf("%s\t%s",12, sum12);


    }
}
