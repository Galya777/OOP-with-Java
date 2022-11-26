package h4task2;

import java.util.Random;

public class AlgebraUtilsTest {
    public static void main(String[] args) {
        Random rand=new Random();
    double[][] a= new double[3][3];
    double[][] b= new double[3][3];


        for (int i = 0; i < 3; ++i) {
            for (int j = 0; j < 3; ++j) {
                a[i][j]= rand.nextInt();
                b[i][j]= rand.nextInt();

            }
        }
        AlgebraUtils u=new AlgebraUtils(a, b);
     double[][] result= u.multiplyMatrix(a, b);
        System.out.println(result);
    }
}
