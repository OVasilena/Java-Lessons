package kleineAufgaben;

import java.util.Scanner;

/**
 * Comhard2017
 * package kleineAufgaben
 * Created by olechka on 01.02.2017.
 * eingabe der Kreditsumme
 * 3,5% jahreszinsen
 * kredit für bestimmte zeit
 * wie groß wird nach dieser zeit die gesamtsumme
 **/
public class BankKredit {
    public static void main(String[] args) {
        System.out.println("Введите сумму кредита для расчета:");
        Scanner krediteingabe = new Scanner(System.in);
        double kredit = krediteingabe.nextInt();

        System.out.println("Введите готовой процент:");
        Scanner zinseingabe = new Scanner(System.in);
        double zins = zinseingabe.nextDouble();
        double jahreszins = zins;

        System.out.println("На сколько лет хотите взять кредит?");
        Scanner jahreseingabe = new Scanner(System.in);
        double jahr = jahreseingabe.nextDouble();

        for( int i = 1; i <= jahr; i++){
            //System.out.println("Сумма расчета " + kredit + "€");
            kredit = Math.rint(100*(kredit + kredit * zins / 100))/100;

            //System.out.println("Кредит на " + i + " год " + kredit + "€");
        }
        System.out.println("Общая сумма кредита через " + jahr + " лет " +kredit + " €");
    }
}
