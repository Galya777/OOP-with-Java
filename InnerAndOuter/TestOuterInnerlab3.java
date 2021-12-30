package task4;

import java.util.Scanner;

public class TestOuterInnerlab3 {
    public static void main(String[] args) {
        Scanner input= new Scanner(System.in);
        String name;
        name= input.next();
        OuterClassA.InnerClassA a=new OuterClassA.InnerClassA(name);
        OuterClassB.InnerClassB b=new OuterClassB.InnerClassB(name);
        String strA=a.toString();
        String strB=b.toString();
        System.out.println(strA);
        System.out.println(strB);

    }
}
