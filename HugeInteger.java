package zad6;

import java.util.Arrays;

public class HugeInteger {
   private int[] bigNumber=new int[40];

    public HugeInteger(int[] bigNumber) {
        setBigNumber(bigNumber);
    }
    public HugeInteger() {
        setBigNumber(new int[]{0});
    }
    public HugeInteger(HugeInteger other) {
        setBigNumber(other.bigNumber);
    }
    public int[] getBigNumber() {
        return bigNumber;
    }

    public void setBigNumber(int[] bigNumber) {
        this.bigNumber = bigNumber;
    }

    public boolean isEqualTo(int[] newOne){
        return Arrays.equals(bigNumber, newOne);
    }
    public boolean isNotEqualTo(int[] newOne){
        return !Arrays.equals(bigNumber, newOne);
    }
    public boolean isGreaterThan(int[] newOne){
        return Arrays.compare(bigNumber, newOne) > 0;
    }
    public boolean isLessThan(int[] newOne){
        return Arrays.compare(bigNumber, newOne) < 0;
    }
    public boolean isGreaterThanOrEqualTo(int[] newOne){
        return Arrays.compare(bigNumber, newOne) >= 0;
    }
    public boolean isLessThanOrEqualTo(int[] newOne){
        return Arrays.compare(bigNumber, newOne) <= 0;
    }
    public boolean isZero(){
        return Arrays.equals(bigNumber, new int[]{0});
    }



    @Override
    public String toString() {
        return "HugeInteger{" +
                "bigNumber=" + Arrays.toString(bigNumber) +
                '}';
    }
}
