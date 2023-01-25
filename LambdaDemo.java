package lab9a_zad1a;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Random;
import java.util.function.Consumer;
import java.util.function.Predicate;
import java.util.stream.Collectors;

public class LambdaDemo {
    public static void main(String[] args) {
        Predicate<Salesperson> predicate1;
        Predicate<Salesperson> predicate2;
        Predicate<Salesperson> predicate;
        Consumer<Salesperson> consumer1;
        Consumer<Salesperson> consumer2;
        Comparator<Salesperson> comparator1;
        Comparator<Salesperson> comparator2;

        predicate1= salesperson -> salesperson.getNumSales()<1200;
        predicate2= salesperson -> salesperson.getNumSales()>900;
        predicate=predicate1.and(predicate2);

        consumer1=salesperson -> {
            salesperson.setSalary(salesperson.getSalary()*1.05);
            System.out.println("Salary up by 5% "+salesperson.getSalary());
        };
        consumer2=salesperson -> {
            if(predicate1.test(salesperson)){
                salesperson.setSalary(salesperson.getSalary()*1.02);
            } else{
                salesperson.setSalary(salesperson.getSalary()*0.98);
            }
            System.out.println(salesperson);
        };
        comparator1=(s1, s2)->(int)(s2.getSalary()-s1.getSalary());
        comparator2=(s1, s2)->s2.getSalary()==s1.getSalary()?
                s1.getNumSales()-s2.getNumSales():comparator1.compare(s1, s2);

Random random= new Random();
        Salesperson[] salespersons =
                {
                        new Salesperson("John Doe", 2000, 949),
                        new Salesperson("Jane Doe", 3900, 1500),
                        new Salesperson("Ann Doe", 2000+ random.nextInt(501),
                                500+random.nextInt(1591)),
                        new Salesperson("Ben Doe", 2000+ random.nextInt(501),
                                500+random.nextInt(1591)),
                        new Salesperson("Coll Doe", 2000+ random.nextInt(501),
                                500+random.nextInt(1591)),
                        new Salesperson("Dean Doe", 2000+ random.nextInt(501),
                                500+random.nextInt(1591)),
                        new Salesperson("Ema Doe", 2000+ random.nextInt(501),
                                500+random.nextInt(1591)),
                        new Salesperson("Phil Doe", 2000+ random.nextInt(501),
                                500+random.nextInt(1591)),
                        new Salesperson("Chloe Doe", 2000+ random.nextInt(501),
                                500+random.nextInt(1591)),
                        new Salesperson("Harry Doe", 2000+ random.nextInt(501),
                                500+random.nextInt(1591)),
                        new Salesperson("Ivy Doe", 2000+ random.nextInt(501),
                                500+random.nextInt(1591)),
                        new Salesperson("Cat Doe", 2000+ random.nextInt(501),
                                500+random.nextInt(1591)),

                };
        List<Salesperson> listOfSalespersons = new ArrayList<>();
// обектите на salespersons да се запишат в listOfSalespersons

        for (Salesperson salesperson : salespersons) {
            applyBonus(salesperson, predicate1, consumer1);
            System.out.println(salesperson);
            salesperson.printNumSales(salesperson);
        }
        for (Salesperson salesperson : salespersons) {
            applyBonus(salesperson, predicate2, consumer2);
            System.out.println(salesperson);
        }
        sort(listOfSalespersons, comparator1);
        System.out.println(listOfSalespersons);
        sort(listOfSalespersons, comparator2);
        System.out.println(listOfSalespersons);

        System.out.println("Grouping by first letter of name");
        group(listOfSalespersons);

    }

    public static void applyBonus(Salesperson salesperson,
                                  Predicate<Salesperson>
                                          predicate,
                                  Consumer<Salesperson> consumer) {
// Напишете if команда, където използвайте predicate
// за да определите дали да изпълните consumer
// Изпълнете consumer, когато условието на if командата е изпълнено
if(salesperson==null||predicate==null||consumer==null){
    return;
}
        if(predicate.test(salesperson)) consumer.accept(salesperson);
    }

    public static void applyBonus(List<Salesperson> salespersons,
                                  Predicate<Salesperson>
                                          predicate,
                                  Consumer<Salesperson> consumer) {
// Напишете if команда, където използвайте predicate
// за да определите дали да изпълните consumer
// Изпълнете consumer, когато условието на if командата е изпълнено
        if (salespersons == null || predicate == null || consumer == null) {
            return;
        }
        for (Salesperson s : salespersons)
            if(predicate.test(s)) consumer.accept(s);
    }

    public static void sort(List<Salesperson> salespersons,
                            Comparator<Salesperson>
                                    comparator) {
// Сортирайте salespersons като използвате comparator
        if(salespersons==null||comparator==null){
            return;
        }
        salespersons.sort(comparator);
    }

    public static void group(List<Salesperson> salespersons) {
// Групирайте имената на salespersons по първата буква в
        //името изведете отделните групи на стандартен изход
        if(salespersons==null){
            return;
        }
        salespersons.stream().collect(Collectors
                .groupingBy(salesperson -> salesperson.getName().charAt(0), Collectors.toList()))
                .forEach(((character, salespeople) -> System.out.printf("\"%c\"\t\t%s\n", character, salespeople)));
    }
}

