package zad4;

public class OuterClassB {
    public class InnerClassB extends OuterClassA.InnerClassA {


        public InnerClassB(String text) {
            super(text);
        }

        @Override
        public String toString() {
            return "InnerClassB{" +
                    "text='" + text + '\'' +
                    '}';
        }
    }

    @Override
    public String toString() {
        return "OuterClassB{}";
    }
    public OuterClassB.InnerClassB get(String text){
        return new OuterClassB.InnerClassB(text);
    }
}
