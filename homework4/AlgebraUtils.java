package h4task2;

public class AlgebraUtils {
    double[][] a;
    double[][] b;

    public AlgebraUtils(double[][] a, double[][] b) {
        this.a = a;
        this.b = b;
    }

    public static double[][] multiplyMatrix(double[][] a, double[][] b){
        int c_rows=a.length;
        int c_cols=b[0].length;
        double[][] c = new double[c_cols][c_rows];
        if(c_rows!= c_cols){
            System.out.println("Impossible to multiply");
        } else{
            for(int i=0; i<c_rows; ++i){
                for(int j=0; j<c_cols;++j){
                    for(int n=0; n< c_cols-1;++n)
                    c[i][j]+=a[i][n] * b[n][j];
                }
            }
        }

      return c;
    }
}
