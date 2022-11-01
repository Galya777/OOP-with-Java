package task6;

public class EqualDigits {
public void showPlayGround(int[] a){
    boolean idThere=false;
    for(int i=0;i<a.length-1;++i){
        if (a[i] == a[i + 1]) {
            idThere=true;
            System.out.printf("Beginning: ",i);
            int length=0;
            do {
                length++;
            } while (a[i] == a[i + 1]);
            System.out.printf("Length: ",length);
        }
    }
    if(idThere) {
        int i = 0;
        while (i < a.length - 1) {
            System.out.print(a[i] + "," + "\t");
            ++i;
        }
    } else{
        System.out.println("Mo playground here!");
    }
}
}
