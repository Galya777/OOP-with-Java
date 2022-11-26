package task4;

public class OuterClassB {

    static class InnerClassB extends OuterClassA.InnerClassA {

        InnerClassB(String text) {
            super(text);
        }

        @Override
        public String toString() {
            return "InnerClassB{}"+getMyName();
        }
    }
InnerClassB getInnerClassB(OuterClassA oa, String s){
        return new InnerClassB(s);
}
    @Override
    public String toString() {
        return "OuterClassB{}";
    }
}
