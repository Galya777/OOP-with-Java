import java.util.Scanner;

public class numberToletters {
     Scanner input=new Scanner(System.in);

    public void main() {
        int number = input.nextInt(); //should be 4-digit number
        for (int i = 0; i < number; ++i) {
            int N = (int) (i * Math.pow(4, i));
            switch (N) {
                case 0:
                    System.out.print("A");
                    break;
                case 1:
                    System.out.print("C");
                    break;
                case 2:
                    System.out.print("G");
                    break;
                case 3:
                    System.out.print("T");
                    break;
            }
        }
    }
}
