Задача 2a
Даден са следният interface Selector и class Sequence , които позволяват да се
манипулира последователност от обекти от първия към последния елемент.
// Defines the basic operations with a sequence.
public interface Selector {
boolean end();
Object current();
void next();
}
public class Sequence { // outer class
// Holds a sequence of Objects.
private Object[] obs;
private int next = 0;
public Sequence(int size) {
obs = new Object[size];
}
public void add(Object x) {
if(next < obs.length) {
obs[next] = x;
next++;
}
}
private class Sselector implements Selector {
// inner class манипулира преместване от първия към последния
int i = 0;
public boolean end() {
return i == obs.length;
}
public Object current() {
return obs[i];
}
public void next() {
if(i < obs.length) i++;
}
} // end of inner class
public Selector getSelector() {
return new Sselector();
}
public static void main(String[] args) {
// (1)създайте Sequence последователност от 8 елемента
// (2)инициализирайте Sequence елементите
// със случайни цели числа от интервала [10, 100]
// (3)използвайте метода getSelector(),за да разпечатате
// тези числа на конзолата
// от първия до последния елемент на последователността
// (4)използвайте метода getRSelector(),за да разпечатате
// на конзолата тези числа
// от последния елемент до първия на последователността
}
} // end of Sequence.java
Извършете следните действия
a) Напишете Java приложение като към class Sequence с горния сорс код
добавите един метод getRSelector(), който (по аналогия с
getSelector()) извършва друго приложение (имплементация) на
interface Selector, при което последователността от обекти се описва в
обратен ред- от последния елемент към първият елемент (end
→ beginning).
b) Изпълнете следните действия в метода main()
• създайте Sequence последователност от 8 елемента;
• инициализирайте Sequence елементите със случайни цели числа от
интервала [10, 100]
• използвайте метода getSelector(),за да разпечатате тези числа на
конзолата от първия до последния елемент на последователността
• използвайте метода getRSelector(),за да разпечатате на конзолата тези
числа от последния елемент до първия на последователността
Задача 2b
Да се използва дадения сорс кода на задача 4a и да се реализира следния ОО
модел.
Целта е да се създаде приложение на Java, което позволява обхождане на
елементите на масива obs в клас Sequence по три начина:
• от първия до последния елемент
• от последния до първия елемент
• в две посоки от зададен индекс на елемент от масива
Интерфейсите и класовете от този модел да се поставят в потребителски пакет с
наименование iterator. Да се създаде този пакет и да се използва в друго Java
приложение, където да се напише клас SequenceTest за тестване на
интерфейсите и класовете от този ОО модел.
