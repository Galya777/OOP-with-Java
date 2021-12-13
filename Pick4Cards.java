package zad7;

import java.util.Random;

public class Pick4Cards {
    public static void main(String[] args) {
        Random rand=new Random();
        int[] card= new int[4];
        for(int i=0;i<4;++i) {
           card[i]=rand.nextInt(1, 13);
        }
        int sum=0;
        for(int i=0;i<4;++i) {
            sum+=card[i];
        }
        System.out.println(sum);
    }
}
