package task1;

public class Celsius {
    private double celsius;

    double convertToFahrenheit() {
        double fahrenheit;
        fahrenheit = 9.0 / 5.0 * celsius + 32;
        return fahrenheit;
    }
    public Celsius(double celsius) {
        this.celsius = celsius;
    }

    public double getCelsius() {
        return celsius;
    }

    public void setCelsius(double celsius) {
        this.celsius = celsius;
    }
}
