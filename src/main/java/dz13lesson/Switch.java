package dz13lesson;

import java.util.Scanner;

public class Switch {
    public static void main(String[] args) {
        //1пример
        /*
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите возраст ");
        int age = scanner.nextInt();
        if (age == 10){
            System.out.println("Ты учишся в школе");
        } else if (age == 18) {
            System.out.println("Ты закончил школу");
        } else if () {
            ...
        }
        */

        //2пример
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите возраст ");
        String age = scanner.nextLine();
        switch (age){
            case "ноль":
                System.out.println("ты родился");
                break;
            case "семь":
                System.out.println("ты пошел в школу");
                break;
            case "восемнадцать":
                System.out.println("ты закончил школу");
                break;
            default:
                System.out.println("Ни одно из предыдущих условий не подошло");
        }

    }
}
