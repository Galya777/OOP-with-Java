package task;

import java.util.*;

import static java.util.Collections.*;

public class ArrayListTest {
    ArrayList<String> text;

    public void sort(){
        text.sort(reverseOrder());
    }

    public void sortByFrwequency() {

        Map<Integer, Integer> elementCountMap = new LinkedHashMap<>();

        //Check presence of each element in elementCountMap

        for (String s : text) {
            if (elementCountMap.containsKey(s)) {
                //If element is present in elementCountMap, increment its value by 1

                elementCountMap.put(Integer.valueOf(s), elementCountMap.get(s) + 1);
            } else {
                //If element is not present, insert this element with 1 as its value

                elementCountMap.put(Integer.valueOf(s), 1);
            }
        }

        //Construct an ArrayList holding all Entry objects of elementCountMap

        ArrayList<Map.Entry<Integer, Integer>> listOfEntry = new ArrayList<>(elementCountMap.entrySet());

        //Sort listOfEntry based on values

        listOfEntry.sort(new Comparator<Map.Entry<Integer, Integer>>() {
            @Override
            public int compare(Map.Entry<Integer, Integer> o1, Map.Entry<Integer, Integer> o2) {
                return o2.getValue().compareTo(o1.getValue());
            }
        });

    }


    public static <T extends Comparable<? super T>>
    T removeMax(List<T> list)
    {
    list.remove(list.stream().max((Comparator<? super T>) list));
        return null;
    }

    public void getNames(){
        text.stream().findAny();
    }
    public void searchNames(){
     text.stream().findAny();
    }
    public void copyTo(ArrayList<String> str){
        text=str;

    }
    public String toStringDescending(){
        sort();
        return text.toString();
    }
}
