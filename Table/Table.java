package zad2;

import java.util.Scanner;

public class Table {
    private double a;
    private double b;
    private int step;

    public Table(double a, double b, int step) {
        setA(a);
        setB(b);
        setStep(step);
    }

    public double getB() {
        return b;
    }

    public void setB(double b) {
        this.b = b;
    }

    public int getStep() {
        return step;
    }



    public void setStep(int step) {
        if(step>0) {
            this.step = step;
        }else{
            this.step = 1;
        }
    }

    public double getA() {
        return a;
    }

    public void setA(double a) {
        this.a = a;
    }

    public void makeTable(){
        Scanner input= new Scanner(System.in);
        int count=0;
        double x=a;
        double size=(b-a)/step;

        System.out.println("x\t\tF(x)");
        do{
            System.out.printf("%.4f\t%.4f\n",x,(x-2)*(x-2)/(x*x+1));
            count++;
            if(count%20==0){
                System.out.println("Press Return to continue...");
                input.nextLine();
            }
            x+=size;
        }while(x<=b);
    }
}
