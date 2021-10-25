package task1;

public class Fahrenheit {
    double fahrenheit;

    double convertToCelsius() {
        double celsius;
        celsius = 5.0 / 9.0 * (fahrenheit - 32);
        return celsius;
    }
    public Fahrenheit(double fahrenheit) {
        this.fahrenheit = fahrenheit;
    }

    public double getFahrenheit() {
        return fahrenheit;
    }

    public void setFahrenheit(double fahrenheit) {
        this.fahrenheit = fahrenheit;
    }
}
