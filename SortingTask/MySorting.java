package zad1;

public class MySorting {
    private MySort callback;

    public MySorting(MySort callback) {
        this.callback = callback;
    }

    public MySorting() {
        callback= new MySort() {
            @Override
            public boolean greater(int a, int b){
                return a>b;
            }
        };
    }

    public MySort getCallback() {
        return callback;
    }

    public void setCallback(MySort callback) {
        this.callback = callback;
    }
    public void sort(int[] numbers){
        if(callback==null||numbers==null) return;
        int swap;
        for (int i=0;i<numbers.length;++i){
            for(int j=0;j<numbers.length-1;++j ){
                if(callback.greater(numbers[j],numbers[j+1])){
                    swap= numbers[j];
                    numbers[j]= numbers[j+1];
                    numbers[j+1]=swap;
                }
            }
        }
    }
}
