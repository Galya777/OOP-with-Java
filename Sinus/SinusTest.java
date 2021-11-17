package sin;

import java.util.Scanner;

public class SinusTest {
    public static void main(String[] args) {

        Scanner kbd = new Scanner(System.in);
        double epsilon;
        double x;
        do {
            System.out.print("Enter Accuracy in the interval (0, 1): ");
            epsilon = kbd.nextDouble();
        }while(epsilon <= 0 || epsilon >= 1); //validate epsilon

        System.out.print("Enter X [rads]: ");
        x = kbd.nextDouble();
        Sinus compute = new Sinus(epsilon);

        System.out.printf("Accurate sin(%.6f) = %.6f %n ", x, Math.cos(x));

        System.out.printf("Approx sin(%.6f) = %.6f %n ", x, compute.computeSin(x));
    }
}
