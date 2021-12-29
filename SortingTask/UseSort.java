package zad1;

import com.sun.source.doctree.SystemPropertyTree;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Random;



public class UseSort {
    public static void print(int[] numbers){
        for (int i = 0; i < numbers.length; i++) {
            System.out.print(numbers[i] + " ");
        }
    }
    public static void main(String[] args) {
        SortOrder sortOrder= new SortOrder();
        MySort asc= sortOrder.getAscendingOrder();
        MySort desc=sortOrder.getDesscendingOrder();

        MySorting mySort= new MySorting();
        Random rand= new Random();
        int[] numbers= new int[20];
        for(int i=0; i<numbers.length;++i){
            numbers[i]=rand.nextInt(101)-50;
        }
        System.out.println("Numbers unsorted: ");
        print(numbers);
        mySort.sort(numbers);
        System.out.println("\nNumbers ascending order: ");
        print(numbers);

        mySort.setCallback(desc);
        mySort.sort(numbers);
        System.out.println("\nNumbers descending order:");
        print(numbers);


        MySorting newSort= new MySorting(){
            @Override
            public void sort(int[] numbers){
                Arrays.sort(numbers);
            }
        };
        System.out.println("\n\nAnonymous ascending:");
        newSort.sort(numbers);
        print(numbers);

        MySorting mySort1 = new MySorting(desc);
        mySort1.sort(numbers);
        System.out.println("\nNumbers descending order:");
        print(numbers);
    }


}
