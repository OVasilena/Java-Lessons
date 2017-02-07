package kleineAufgaben;

/**
 * Comhard2017
 * package kleineAufgaben
 * Created by olechka on 31.01.2017.
 * радар
 * <60 км/ч --> счастливого пути
 * >60 <100 --> штраф 20
 * >130км/ч --> забрать права
 * скорость F
 **/

import java.util.Scanner;

public class Flensburg {
    public static void main(String[] args) {
        System.out.println("Введите скорость машины");
        Scanner eingabe = new Scanner(System.in);
        int g = eingabe.nextInt();
        //int g = 130;
        int a, m, h;
        a = 60;
        m = 100;
        h = 130;

        if (g <= a){
            System.out.println("Счастливого пути");
        }
        if (g > a && g <= m) { // g ist zwischen a und m

            System.out.println("Вы превысили скорость. Штраф 20 €");

        }
        if (g >= h) {
            System.out.println("Вы превысили скорость. Сдайте свои права!");

        }
        System.err.println("Программа отработала без ошибок");

    }

}
