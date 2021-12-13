package zad6;

import java.util.Arrays;

public class MathArray {
    int[][] table;
    int[] list;

    public MathArray() {
        table= new int[][]{{3, 4, 5, 6, 3},
                {2, 1, 2, 1, 1},
                {3, 2, 1, 4, 9},
                {1, 0, 0, 1, 1},
                {9, 2, 6, 4, 9}};
        list= new int[]{2, 1, 2, 3, 4};
    }
   int[] multiplyMatrixByRow(){
        int[] result=new int[5];
        for(int i=0; i<5;++i){
            for(int j=0;j<5;++j){
                for(int k=0;k<5;++k) {
                    result[i] += list[j]*table[j][k];
                }
            }
        }
return result;
    }

    int[][] squareMatrix(){
        int[][] result= new int[5][];
        for(int i=0; i<5;++i) {
            for (int j = 0; j < 5; ++j) {
                    result[i][j] += table[i][j] * table[i][j];
            }
        }
return result;
    }

    double scalarProduct(){
        double scalar=0;
        for(int i=0;i<5;++i){
            scalar+=list[i]*list[i];
        }
     return Math.sqrt(scalar);
    }

    int[][] transposeMatrix(){
        for(int i=0; i<5;++i){
            for(int j=0;j<5;++j){
                table[i][j]=table[j][i];
            }
        }
return table;
    }

   double matrixTrace(){
        double sum=0;
       for(int i=0; i<5;++i){
               sum+=table[i][i];
           }
       return sum;
   }

    public String toString(int[] matrix){
        return String.format("\t%s", (Object) matrix);

    }

    public String toString(int[][] matrix){
        return String.format("\t%s", (Object) matrix);
    }

    @Override
    public String toString() {
        return "MathArray{" +
                "table=" + Arrays.toString(table) +
                ", list=" + Arrays.toString(list) +
                '}';
    }
}
