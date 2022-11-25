package task4;

import java.util.UUID;

public class SavingsAccount {
    private int mAnnualInterestRate;
    private int mSavingsBalance;
    private final UUID mNumber= UUID.randomUUID();

    public SavingsAccount(int mAnnualInterestRate,int mSavingsBalance) {
        setmAnnualInterestRate(mAnnualInterestRate);
        setmSavingsBalance(mSavingsBalance);
    }

    public SavingsAccount() {
        setmAnnualInterestRate(0);
        setmSavingsBalance(0);
    }

    public SavingsAccount(SavingsAccount other) {
        setmAnnualInterestRate(other.mAnnualInterestRate);
        setmSavingsBalance(other.mSavingsBalance);
    }

    public int getmAnnualInterestRate() {
        return mAnnualInterestRate;
    }

    public void setmAnnualInterestRate(int mAnnualInterestRate) {
        this.mAnnualInterestRate = mAnnualInterestRate;
    }

    public int getmSavingsBalance() {
        return mSavingsBalance;
    }

    public void setmSavingsBalance(int mSavingsBalance) {
        this.mSavingsBalance = mSavingsBalance;
    }
    public int calculateMonthlyInterest(){
        return mSavingsBalance*mAnnualInterestRate /12;
    }
    public void modifyInterestRate(int newRate){
        mAnnualInterestRate=newRate;
    }
    public boolean isGreater(SavingsAccount acc){
        return mSavingsBalance<acc.mSavingsBalance;
    }

    @Override
    public String toString() {
        return String.format("SavingsAccount: %s\n Balance: %s\n",mAnnualInterestRate,mSavingsBalance);
    }
}
