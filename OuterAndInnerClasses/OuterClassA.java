package zad4;

public class OuterClassA {
    public class InnerClassA {

       String text;

        public InnerClassA(String text) {
            this.text = text;
        }

        @Override
        public String toString() {
            return "InnerClassA{" +
                    "text='" + text + '\'' +
                    '}';
        }
    }

    @Override
    public String toString() {
        return "OuterClassA{}";
    }
    public InnerClassA get(String text){
        return new InnerClassA(text);
    }
}
