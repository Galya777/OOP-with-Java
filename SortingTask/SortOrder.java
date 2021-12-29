package zad1;

public class SortOrder {
    private class AscendingOrder implements MySort{

        @Override
        public boolean greater(int a, int b){
            return a>b;
        }
    }

    private class DescendingOrder implements MySort{

        @Override
        public boolean greater(int a, int b){
            return a<b;
        }
    }
public MySort getAscendingOrder(){
return new AscendingOrder();
};
    public MySort getDesscendingOrder(){
return new DescendingOrder();
    };
}
