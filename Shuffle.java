package ShuffleRow;

import java.util.Random;

public class Shuffle {
    public static void shuffle(int[][] m){
      int rows=m.length;
        for ( int first = 0; first < rows; first++ )
        {
            Random rand=new Random();
            int second =  rand.nextInt( rows );

            int[] temp = m[ first ];
            m[ first ] = m[ second ];
            m[ second ] = temp;
        } // end for

    }

    public static void main(String[] args) {
        int[][] m = {{1, 2}, {3, 4}, {5, 6}, {7, 8}, {9, 10}};
        shuffle(m);
        System.out.println(m);
    }
}
