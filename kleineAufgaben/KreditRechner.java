package kleineAufgaben;

/**
 * Comhard2017
 * package kleineAufgaben
 * Created by olechka on 06.02.2017.
 **/
/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */


        import java.util.Scanner;

/**
 *
 * @author opodlubnaja
 */
public class KreditRechner {
    public static void main(String[] args) {
        double kredit;
        double zinssatz;
        int laufzeit;
        double jahresrate, tilgung, zins;
        double hilfszahl;

        Scanner scanner1 = new Scanner(System.in);
        System.out.println("Kredit: ");
        kredit = scanner1.nextDouble();

        Scanner scanner2 = new Scanner(System.in);
        System.out.println("Zinssatz: ");
        zinssatz = scanner2.nextDouble();

        Scanner scanner3 = new Scanner(System.in);
        System.out.println("Laufzeit: ");
        laufzeit = scanner3.nextInt();

        hilfszahl = Math.pow((1 + zinssatz/100), laufzeit);
        jahresrate = kredit * (hilfszahl*zinssatz/100)/(hilfszahl-1);

        for(int i = 0; i < laufzeit; i++){
            System.out.println("Jahr " + i);
            System.out.println("Kredit zum Jahresanfang " + Math.round(kredit*100)/100.00);

            zins = kredit * zinssatz/100;
            tilgung = jahresrate - zins;
            kredit -= tilgung;
            System.out.println("Tilgung " + Math.round(tilgung*100)/100.00 + "\tJahresrate " +Math.round(jahresrate*100)/100.00);
        }


    }

}
