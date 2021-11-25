package task1;

public class CreditCard {
    private long cardNumber;

    public CreditCard(long cardNumber) {
        this.cardNumber = cardNumber;
    }

    public CreditCard() {
       new CreditCard(0);
    }

    public long getCardNumber() {
        return cardNumber;
    }

    public void setCardNumber(long cardNumber) {
        this.cardNumber = cardNumber;
    }

    boolean isItValid(){
        int counter=1;
        int sum=0;
        int oddSum=0;
        while(cardNumber>0){
            int current= (int)(cardNumber%10);
            current*=2;
            if(current>=10){
                current= current/10+current%10;
            }
            sum+=current;
            if(counter%2!=0){
                current/=2;
                oddSum+=current;
            }
                cardNumber/=10;
            counter++;
        }
        int sumOfAll= sum + oddSum;
        return sumOfAll % 10 == 0;
    }
    public static int sumOfDoubleEvenPlace(long number){
        int evensum=0;
        int counter=1;
        while(number>0){
            int current= (int)(number%10);
            current*=2;
            if(counter%2==0){
                evensum+=current;
            }
            number/=10;
            counter++;
        }
        return evensum;

    }
    /** Return this number if it is a single digit, otherwise,
     * return the sum of the two digits */
    public static int getDigit(int number){
        int current= (int)(number%10);
        current*=2;
        if(current>=10){
            current= current/10+current%10;
        }
        return current;
    }
    /** Return sum of odd-place digits in number */
    public static int sumOfOddPlace(long number){
        int counter=1;
        int oddSum=0;
        while(number>0){
            int current= (int)(number%10);
            if(counter%2!=0){
                oddSum+=current;
            }
            number/=10;
            counter++;
        }

        return oddSum;
    }
    /** Return true if the digit d is a prefix for number */
    public static boolean prefixMatched(long number, int d){
        return number%10==d;
    }
    /** Return the number of digits in d */
    public static int getSize(long d){
        int counter=1;
        while(d>0){
            d/=10;
            counter++;
        }
        return counter;
    }
    /** Return the first k number of digits from number. If the
     * number of digits in number is less than k, return number. */
    public static long getPrefix(long number, int k){
         int prefix=0;
        while(number>0){
            int current= (int)(number%10);
            if(current==k){
                prefix=k;
                break;
            }
            number/=10;

        }
       return prefix;
    }
    //Here are sample runs of the program:
    // (You may also implement this program by reading the input as a string and
    // processing the string to validate the credit card.)

}
