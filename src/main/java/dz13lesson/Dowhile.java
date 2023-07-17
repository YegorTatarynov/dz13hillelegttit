package dz13lesson;

import java.util.Scanner;

public class Dowhile {
    public static void main(String[] args) {
        /*//1пример
        Scanner scanner = new Scanner (System.in);
        System.out.println("Введите 5");
        int value = scanner.nextInt();
        while (value!=5){
            System.out.println("Введите 5");
            value = scanner.nextInt();
        }
        System.out.println("Вы ввели 5");
         */
        Scanner scanner = new Scanner (System.in);
        int value;
        do {
            /* Если мы value объявим не перед циклом а в самом цикле
            то в условии цикла while переменная value будет подчеркиватся
            красным цветом, ведь каждая переменная доступно только в границах
            фигурных скобок в которых она находится. */
            System.out.println("Введите 5");
            value = scanner.nextInt();
        } while (value != 5);
    }

    public static void main2() {
        //value = 5
        //в этом методе, value будет подчеркнуто красным цветом поскольку
        //она находится в методе main, и для этого метода она недоступна.
    }
}
