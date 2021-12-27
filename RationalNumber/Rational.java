package task3;

public class Rational {
    private int numerator;
    private int denominator;

    //Helper function for gcd
    private int gcd(int first, int second){
        int number;
        while (second!=0){
            number=first;
            first=second;
            second=number%first;
        }
        return first;
    }
    private void simplify(int first, int second){
        int d= gcd(first,second);
        if(d!=1){
            first/=d;
            second/=d;
        }
    }

    public Rational(int numerator, int denominator) {
        simplify(numerator, denominator);
        setNumerator(numerator);
        setDenominator(denominator);
    }
    public Rational() {
        setNumerator(1);
        setDenominator(1);
    }

    public int getDenominator() {
        return denominator;
    }

    public void setDenominator(int denominator) {
        this.denominator = denominator>0?denominator:Math.abs(denominator);
    }

    public int getNumerator() {
        return numerator;
    }

    public void setNumerator(int numerator) {
        this.numerator = numerator;
    }

    public Rational sum(Rational other){
        int newNumerator, newDenominator;
        int d=gcd(denominator, other.denominator);
        newDenominator=(denominator* other.denominator)/d;
        if(d!=1) {
            numerator *= (double) newDenominator / denominator;
            other.numerator *= (double) newDenominator / other.denominator;
        }
        newNumerator=numerator+other.numerator;

        return new Rational(newNumerator, newDenominator);
    }
    public Rational subtract(Rational other){
        int newNumerator, newDenominator;
        int d=gcd(denominator, other.denominator);
        newDenominator=(denominator* other.denominator)/d;
        if(d!=1) {
            numerator *= (double) newDenominator / denominator;
            other.numerator *= (double) newDenominator / other.denominator;
        }
        newNumerator=numerator-other.numerator;

        return new Rational(newNumerator, newDenominator);
    }
    public Rational multiply(Rational other){
        int newNumerator, newDenominator;
        newNumerator=numerator*other.numerator;
        newDenominator=denominator*other.denominator;
        simplify(numerator, denominator);
        return new Rational(newNumerator, newDenominator);
    }
    public Rational divide(Rational other){
        int newNumerator, newDenominator;
        newNumerator=numerator*other.denominator;
        newDenominator=denominator*other.numerator;
        simplify(numerator, denominator);
        return new Rational(newNumerator, newDenominator);
    }

    @Override
    public String toString() {
        return String.format("%d/%d",numerator,denominator);
    }
}
