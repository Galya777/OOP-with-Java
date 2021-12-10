package zad4;

import java.util.Objects;

public class Barcode {
  private final String[][] code=new String[3][5];

    public Barcode(int numberToCode) {
        int last= numberToCode%10;
        numberToCode/=10;
        int second=numberToCode%10;
        int first= numberToCode/10;
        code[0]= decode(first);
        code[1]=decode(second);
        code[2]=decode(last);
            }

    public String[][] getCode() {
        return code;
    }

    private String[] decode(int digit){
        String[] one={"0","0","0","1","1"};
        String[] two={"0","0","1","1","0"};
        String[] three={"0","0","1","1","0"};
        String[] four={"0","1","0","0","1"};
        String[] five={"0","1","0","1","0"};
        String[] six={"0","1","1","0","0"};
        String[] seven={"1","0","0","0","1"};
        String[] eight={"1","0","0","1","0"};
        String[] nine={"1","0","1","0","0"};
        String[] zero={"1","1","0","0","0"};
        String[] empty={"","","","",""};
        return switch (digit) {
            case 1 -> one;
            case 2 -> two;
            case 3 -> three;
            case 4 -> four;
            case 5 -> five;
            case 6 -> six;
            case 7 -> seven;
            case 8 -> eight;
            case 9 -> nine;
            case 0 -> zero;
            default -> empty;
        };
    }
    void printBarcode(){
        for (String[] strings : code) {
            for (String string : strings) {
                if (Objects.equals(string, "0")) {
                    System.out.print(":");
                } else {
                    System.out.print("|");
                }
            }
        }
    }
}
