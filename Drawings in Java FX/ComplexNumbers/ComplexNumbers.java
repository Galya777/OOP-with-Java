package task2;

public class ComplexNumbers {
    private final double realPart;
    private final double imaginaryPart;

    public ComplexNumbers(double realPart,double imaginaryPart) {
        this.realPart = realPart;
        this.imaginaryPart= imaginaryPart;
    }

    public ComplexNumbers add(ComplexNumbers other) {
        return new ComplexNumbers(other.realPart, other.imaginaryPart);
    }

    public double getAngle(){
       return Math.atan2(realPart, imaginaryPart);
    }

    public double getImaginaryPart() {
        return imaginaryPart;
    }
    public double getMagnitude(){
        return Math.sqrt(realPart*realPart+imaginaryPart*imaginaryPart);
    }
    public double getRealPart() {
        return realPart;
    }
}
