package PerfectNumber;

public class PerfectNumber {
    public static final int NUMBER_PER_LINE = 5;
    private static final int NUMBER_OF_PERFECTS= 10000;

    public static boolean isPerfect(int number){
      int sum=0;
      for(int i=1; i<number;++i){
          if(number%i==0){
              sum+=i;
          }
      }
      if(sum==number){
          return true;
      }
        return false;
    }

    public static void showMultipliers(int number){
        int counter=0;
        for(int i=1; i<number;++i) {
            if (number % i == 0) {
                counter++;
                System.out.printf("\t", i);
                if(counter==NUMBER_PER_LINE){
                    System.out.println("\n");
                }

            }
        }
    }

    public static void main(String[] args) {
        for (int j = 0;j<NUMBER_OF_PERFECTS;++j ){
            if(isPerfect(j)==true){
                System.out.println(j);
                showMultipliers(j);
            }
        }

    }
}
