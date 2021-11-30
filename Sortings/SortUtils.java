package task5;

import java.lang.reflect.Array;
import java.util.*;

import static java.lang.Math.random;

public class SortUtils {
    public SortUtils() {

    }

    private static void swap(int xp, int yp)
    {
        int temp = xp;
	    xp = yp;
	    yp = temp;
    }
    public static void init(int[] a){
        int m, n, i, j;
        Scanner in = null;
        try {
            in = new Scanner(System.in);
            System.out.println("Enter the number "
                    + "of rows of the matrix");
            m = in.nextInt();
            System.out.println("Enter the number "
                    + "of columns of the matrix");
            n = in.nextInt();

            // Declare the matrix
            int first[][] = new int[m][n];

            // Read the matrix values
            System.out.println("Enter the elements of the matrix");
            for (i = 0; i < m; i++)
                for (j = 0; j < n; j++)
                    first[i][j] = in.nextInt();

            // Display the elements of the matrix
            System.out.println("Elements of the matrix are");
            for (i = 0; i < m; i++) {
                for (j = 0; j < n; j++)
                    System.out.print(first[i][j] + "  ");
                System.out.println();
            }
        }
        catch (Exception e) {
        }
        finally {
            in.close();
        }
    }
    public static void print(int[] a){
        for (int j : a) {
            System.out.print(j + ", ");
        }
    }
    public static void sortBbl(int[] a){
        int i, j;
        for (i = 0; i < a.length-1; i++)
            for (j = 0; j < a.length-i-1; j++)
                if (a[j] > a[j+1])
                    swap(a[j], a[j+1]);
    }
    public static int[] mergeSort(int a[], int[] b){
        int length = a.length + b.length; //add the length of firstArray into secondArray
        int[] mergedArray = new int[length];    //resultant array
        int pos = 0;
        for (int element : a) //copying elements of secondArray using for-each loop
        {
            mergedArray[pos] = element;
            pos++;              //increases position by 1
        }
        for (int element : b) //copying elements of firstArray using for-each loop
        {
            mergedArray[pos] = element;
            pos++;
        }
        return mergedArray;
    }
}
