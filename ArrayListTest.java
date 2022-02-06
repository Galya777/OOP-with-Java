package task2;

import java.util.ArrayList;
import java.util.Collections;

public class ArrayListTest {

    public static <E extends Comparable<E>> E max(E[][] list){
       if(list==null||list.length==0||list[0].length==0){
           return null;
       }
       E max =list[0][0];
       for(int i=0; i<list.length;++i){
           for(int j=0; j<list[0].length;++j){
               if(max.compareTo(list[i][j])<0){
                   max= list[i][j];
               }
           }
       }
       return max;
    }

    public static <E> void shuffle(ArrayList<E> list){
     if(list==null){
         return;
     }
     Collections.shuffle(list);
    }

    public static <E extends Comparable<E>> E max(ArrayList<E> list){
        if (list == null) {
            return null;
        }
        return Collections.max(list);
    }

    public static <E> ArrayList<E> removeDuplicates(ArrayList<E> list){
        if (list == null) {
            return null;
        }
        ArrayList<E > noDuplicates= new ArrayList<>();
        for(int i=0; i<list.size();++i){
            if(Collections.frequency(list, list.get(i))==1){
                noDuplicates.add(list.get(i));
            }
        }
        return noDuplicates;
    }

    public static void main(String[] args) {
 Double[][] numbers= {
         {3.4, 2.3, 7.1},
         {-4.3, 4.9},
         {1.2, 9.12, 9.1, 15.7}
 };
System.out.println("Max: "+max(numbers));

//b)
        ArrayList<Integer> list= new ArrayList<>();
        for(int i=0; i<21; ++i){
            list.add(i);

        }
        shuffle(list);
        System.out.println("Shuffled list: "+list);

       //c)
        System.out.println("Max: "+max(list));
        ArrayList<Car> cars= new ArrayList<>();
        cars.add(new Car("model", 2000));
        cars.add(new Car("model", 1998));
        cars.add(new Car("model", 1999));
        cars.add(new Car("model", 2004));
        cars.add(new Car("model", 2015));
        cars.add(new Car("model", 1989));
     System.out.println("Max in cars: "+ max(cars).toString());



        //d)
        ArrayList<String> duplicates= new ArrayList<>();
        duplicates.add("str1");
        duplicates.add("str2");
        duplicates.add("str1");
        duplicates.add("str4");
        duplicates.add("str5");
        duplicates.add("str3");
        System.out.println("Duplicates "+ removeDuplicates(list));

    }


}
