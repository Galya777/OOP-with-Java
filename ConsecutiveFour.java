package zad7;

import java.util.Scanner;

public class ConsecutiveFour {
    public static boolean isConsecutiveFour(int[] values){

        for(int i=0; i< values.length-1;++i){
            int con=0;
            while(values[i] == values[i + 1]) {
                ++con; ++i;
            }
            if(con==4){
                return true;
            }
        }
return false;
    }

    public static void main(String[] args) {

        Scanner input= new Scanner(System.in);
        System.out.println("Enter the size of your array: ");
        int size=input.nextInt();
        int[] arr=new int[size];
        for(int i=0;i<size;++i){
            arr[i]=input.nextInt();
        }
        if(isConsecutiveFour(arr)){
            System.out.println("It contains");
        } else{
            System.out.println("The list does not contain");
        }
    }
}
