package zad2;

public class Sequence {// outer class
// Holds a sequence of Objects.

    private Object[] obs;
    private int next = 0;

    public Sequence(int size) {
        obs = new Object[size];
    }

    public void add(Object x) {
        if(next < obs.length) {
            obs[next] = x;
            next++;
        }
    }

    private class SselectorForward implements SelectorForward {
        // inner class манипулира преместване от първия към последния
        private int i = 0;
        public boolean end() {
            return i == next;
        }


        public Object current() {
            return obs[i];
        }

        public void next() {
            if(i < obs.length) i++;
        }
    } // end of inner class

    public Selector getSelector() {
        return new SselectorForward();
    }

    private class SSelectorBackward implements SelectorBackward {
        // inner class манипулира преместване от последния към първия
        private int i = next - 1; //последния инициализиран елемент
        public boolean begin() {
            return i == -1;
        }
        public Object current() {
            return obs[i];
        }
        public void previous() {
            if(i >= 0) i--;
        }
    } // end of inner class
    public SelectorBackward getSelectorBackward() {
        return new SSelectorBackward();
    }
}
