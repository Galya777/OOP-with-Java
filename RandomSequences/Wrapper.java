package Lab8F18;

import java.util.Random;

public class Wrapper {
    private int size;

    public Wrapper(int size) {
        setSize(size);
    }

    public int getSize() {
        return size;
    }

    public void setSize(int size) {
        if (size > 0){
            this.size = size;
        }else{
            this.size = 1;
        }
    }

    private class FixedRandom implements Cipherable{

        @Override
        public char[] getSecretChars(int seed) {
            if (seed <= 0) return null;

            Random random = new Random(seed);
            char[] result = new char[size];
            for (int i = 0; i < size; i++) {
                result[i] = (char) ('A' + random.nextInt(26));
            }

            return result;
        }
    }

    public Cipherable makeFixedSelection(){
        return new FixedRandom();
    }

    private class FixedSelection implements Cipherable{

        @Override
        public char[] getSecretChars(int seed) {
            if (seed <= 0) return null;

            Random random = new Random(seed);
            char[] result = new char[size];
            char[] letters = new char[seed];

            for (int i = 0; i < seed; i++) {
                letters[i] = (char) ('A' + random.nextInt(26));
            }
            for (int i = 0; i < size; i++) {
                result[i] = letters[random.nextInt(seed)];
            }

            return result;
        }
    }

    public Cipherable makeFixedRandom(){
        return new FixedSelection();
    }
}

