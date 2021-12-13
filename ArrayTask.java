package zad7;

import java.util.Random;

public class ArrayTask {
    static boolean isItHereAlready(int[] arr, int num){
        for (int j : arr) {
            if (j == num) {
                return true;
            }

        }
        return false;
    }
    public static void main(String[] args) {
        Random rand=new Random();
        int[] arr=new int[5];
        int counter=0;
        while(counter<5){
            int num=rand.nextInt(10, 100);
            if(!isItHereAlready(arr, num)) {
                arr[counter] = num;
                counter++;
            }
        }

        for(int i=0;i<5;++i){
            System.out.print(arr[i]+" ");
        }
    }
}
