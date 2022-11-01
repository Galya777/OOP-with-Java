В редица случаи се налага използване на меню, за представяне на различни
възможности за избор при изпълнение на програма.
Да предположим, че имате за задача да позволите да въведе число в плаваща запетая
и и той да може да пресметне експонентата, синуса и най- голямото цяло число, което е
по- малко или равно на въведеното число.
Нека потребителят прави своя избор, посредством следното меню в текстов формат
1. Въведи число x в плаваща запетая
2. Пресметни и изведи exp(x)
3. Пресметни и изведи sin(x0
4. Пресметни и изведи floor(x)
5. Край
1. Напишете алгоритъма и UML визуализацията (на хартия) за метод , който
• изобразява това меню, докато не се избере опция 5,
• позволява на потребителя да въведе номер на желана опция
• изпълнява, избраната опция
• изчиства текстовия екран текстовия екран преди ново извеждане на менюто
• използвайте “разделяй и владей” за описване на алгоритъма
2. Задачата да се структурира като програма на Java, състояща се от два класа по
аналогия с fig 6.3- 6.4 от Лекция Седмица 3
Единият от класовете (пасивният клас или т. нар клас за многократно ползване) да
реализира табулацията (например, именувайте го class ComputeByMenu). Нека този
клас да има
• клас данна double x
• конструктор за общо ползване , който инициализира x при създаване на
обект от class ComputeByMenu
• метод public void displayMenu() {}, който да изчиства текстовия екран
(изведете 50-60 празни реда) и извежда менюто
• метод public void doSelection(int choice) {}, който да изпълнява
избраната опция с номер choice- използвайте клас данната x и методите на
class Math
• метод public void getUserChoice() {}, който да извежда менюто и
изпълнява функциите му
Другият клас (активният клас или т. нар клас за тестване, например, именувайте го
class MenuTest ) да реализира
• да създаде обект от пасивния клас (class ComputeByMenu) като използва
конструктора му за общо ползване за да инициализира този обект със
стойност 0.00 за клас данната x
• изпълнява метода getUserChoice() на така създадения обект за class
ComputeByMenu