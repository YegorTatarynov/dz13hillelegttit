package dz13lesson;

import java.util.Scanner;

public class Input {
    public static void main(String[] args) {
        //String s = "fqegtyux";
        //String s = new String("xseaurdjhnmv");
        Scanner s = new Scanner(System.in);
        System.out.println("введите что-нибудь");
        String string = s.nextLine();
        System.out.println("Вы ввели: " + string);
    }
}
