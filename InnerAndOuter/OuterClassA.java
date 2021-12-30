package task4;

public class OuterClassA {

    static class InnerClassA{
        private String myName;
        InnerClassA(String text){
            this.myName=text;
        }

        public String getMyName() {
            return myName;
        }

        public void setMyName(String myName) {
            this.myName = myName;
        }

        @Override
        public String toString() {
            return "InnerClassA{}"+ myName;
        }
    }
    InnerClassA getInnerClassA(String s){
        return new InnerClassA(s);
    }

    @Override
    public String toString() {
        return "OuterClassA{}";
    }
}
