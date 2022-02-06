package task3;

import java.util.*;

public class Teams {
    public static void main(String[] args) {
        TreeMap<String, String> teams= new TreeMap<>();

        teams.put("San Francisco", "Forty-niners");
        teams.put("Chicago", "Bears");
        teams.put("Denver", "Broncos");
        teams.put("Seattle", "Seahawks");
        teams.put("Miami", "Dolphins");
        teams.put("Detroit", "Lions");

 /*
        a) Изведете броят на елементите в изображението TreeMap<String,
String> teams и името на отбора от Chicago.
b) Променете името на отбора от San Francisco да бъде "Niners".
c) Отговорете на въпроса, дали San Diego има отбор въведен в
съответствието TreeMap<String, String> teams .
d) Изтрийте Denver от съответствието TreeMap<String, String>
teams.
e) Въведете отбора Cowboys на Dallas в съответствието
TreeMap<String, String> teams .
f) Изведете на стандартен изход полученото съответствие
TreeMap<String, String> teams.
g) Изведете на стандартен изход ключовете и стойностите на полученото
съответствие TreeMap<String, String> teams, сортирани в
низходящ ред на стойностите т.е. имената на клубовете на отборите,
заедно с градовете на тези клубове.
         */
        //a)
        System.out.println("Size: " + teams.size());
        System.out.println("Team from Chicago: " + teams.get("Chicago"));

        //b)
        teams.put("San Francisco", "Niners");

        //c)
        System.out.printf("San Diego %s a team\n",
                teams.containsKey("San Diego")? "has" : "doesn't have");

        //d)
        teams.remove("Denver");

        //e)
        teams.put("Dallas", "Cowboys");

        List<String> citiesMZ = new ArrayList<>();
        System.out.println("M-Z");
        for (Map.Entry<String, String> entry : teams.entrySet()) {
            if (entry.getKey().matches("^[M-Z].*$")){
                System.out.printf("%-15s %-15s\n",
                        entry.getKey(), entry.getValue());
                citiesMZ.add(entry.getKey());
            }
        }
        System.out.println();

        for (int i = 0; i < citiesMZ.size(); i++) {
            //    teams.remove(citiesMZ.get(i));
        }

        //Извеждаме резултат (2021)
        //System.out.println(teams);
        System.out.printf("%-15s %-15s\n", "Key:", "Value:");
        for (Map.Entry<String, String> entry : teams.entrySet()){
            System.out.printf("%-15s %-15s\n",
                    entry.getKey(), entry.getValue());
        }

        //f) sort by frequency
        TreeMap<String, String> teamsDescendingOrder =
                new TreeMap<>(Collections.reverseOrder());
        teamsDescendingOrder.putAll(teams);
        System.out.println(teamsDescendingOrder);

        Map<String, String> teamsDescending = sortByValue(teams);
        System.out.println(teamsDescending);
    }

    public static <K, V extends Comparable<? super V>> Map<K, V> sortByValue(Map<K, V> map) {
        List<Map.Entry<K, V>> list = new ArrayList<>(map.entrySet());
        Collections.sort(list, Map.Entry.comparingByValue());
        Collections.reverse(list);

        Map<K, V> result = new LinkedHashMap<>();
        for (Map.Entry<K, V> entry : list) {
            result.put(entry.getKey(), entry.getValue());
        }

        return result;
    }
}
