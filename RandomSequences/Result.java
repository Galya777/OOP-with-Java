package Lab8F18;

import java.util.Arrays;

public class Result {
   char[] chars;
   int data;

    public Result(char[] chars, int data) {
        this.chars = chars;
        this.data = data;
    }

    public char[] getChars() {
        return chars;
    }

    public void setChars(char[] chars) {
        this.chars = chars;
    }

    public int getData() {
        return data;
    }

    public void setData(int data) {
        this.data = data;
    }

    @Override
    public String toString() {
        return "Result{" +
                "chars=" + Arrays.toString(chars) +
                ", data=" + data +
                '}';
    }
}
