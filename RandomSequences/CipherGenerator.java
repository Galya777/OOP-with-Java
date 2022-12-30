package Lab8F18;

public class CipherGenerator {
    public Result countDistinct(Cipherable cipher, int seed){
        char[] chars = cipher.getSecretChars(seed);
        int data = 0;
        int count;

        for (int i = 0; i < chars.length; i++) {
            count = 0;
            for (int j = 0; j < chars.length; j++) {
                if(i != j && chars[i] == chars[j]){
                    count++; break;
                }
            }
            if(count == 0) data++;
        }
        return new Result(chars, data);
    }

}
