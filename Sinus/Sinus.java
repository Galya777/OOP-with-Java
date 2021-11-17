package sin;

public class Sinus {
      private double epsilon;


    public Sinus(double epsilon) {
        setEpsilon(epsilon);
    }
    public double getEpsilon() {
        return epsilon;
    }

    public void setEpsilon(double epsilon) {
        this.epsilon = epsilon <= Double.MAX_VALUE && epsilon >= Double.MIN_VALUE? epsilon: 0.0 ;
    }
    public double  computeSin(double x){
        double sum; // sum of terms
        double term;  // single term of series expansion
        int counter ; // term sequence

        // initialization
        sum = 1;
        term = 1;
        counter = 1;
        // processing
        do { // reuse result from the previous iteration
            term = -term * x * x / ((2 * counter) * (2 *counter -1));
            sum += term;
            counter++;
        } while (Math.abs(term) > epsilon);
        // output
        return sum;
    }
}
