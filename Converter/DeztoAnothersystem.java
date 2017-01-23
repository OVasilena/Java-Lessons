package Converter;

import java.util.Scanner;

/**
 * Comhard2017
 * package Converter
 * Created by olechka on 23.01.2017.
 * Basis 2-16
 * auf plausibilität überprüfen
 **/
public class DeztoAnothersystem {
    public static void main(String[] args) {

        int basis; // basis von 2 bis 16
        int dzahl; // dezimalzahl
        int modulovariable; // modulo
        String ergebnis = " "; //

        Scanner scanner = new Scanner(System.in);
        System.out.println("Bitte geben Sie Dezimalzahl ein: ");
        dzahl = scanner.nextInt();

        if (dzahl < 0){
            System.out.println("Bitte geben Sie eine positive Zahl ein: ");
            dzahl = scanner.nextInt();
        }

        System.out.println("Bitte geben Sie Basis ein: ");
        basis = scanner.nextInt();

        if (basis < 2){
            System.out.println("Falsche Eingabe. Bitte geben Sie eine Zahl zwischen 2 und 16 ");
            basis = scanner.nextInt();
        }
        if (basis > 16){
            System.out.println("Falsche Eingabe. Bitte geben Sie eine Zahl zwischen 2 und 16 ");
            basis = scanner.nextInt();
        }

        while (dzahl>0) {
            modulovariable = dzahl % basis;
            String modulostring = String.valueOf(modulovariable);
            dzahl = dzahl/basis;

            switch (modulovariable) {
                case 10:
                    modulostring = "A";
                    break;
                case 11:
                    modulostring = "B";
                    break;
                case 12:
                    modulostring = "C";
                    break;
                case 13:
                    modulostring = "D";
                    break;
                case 14:
                    modulostring = "E";
                    break;
                case 15:
                    modulostring = "F";
                    break;
                default:
                    break;
            }
            ergebnis = modulostring + ergebnis;
        }
        System.out.println(ergebnis);
    }
}