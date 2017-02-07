package Uebungen95;

import java.util.Scanner;

/**
 * Comhard2017
 * package Uebungen95
 * Created by olechka on 05.02.2017.
 **/
public class HelloAlgorithm420 {
    public static void main(String[] args) {

        System.out.println("Bitte geben Sie eine Zahl ein");
        Scanner eingabe = new Scanner(System.in);
        double n = eingabe.nextDouble();
        double k, m, p;
        double i = 3;
        double j = 3;

        System.out.println("For-Schleife");
        for(double s = 3; s < (2*n); s++){
            k = 1/(2*s+1);
            System.out.print(Math.rint(k*100)/100 + "\t");
        }
        System.out.println();
        System.out.println("While-Schleife");
        while(i < (2*n)){
            p = 1/(2*i+1);
            i++;
            System.out.print(Math.rint(p*100)/100 + "\t");
        }
        System.out.println();
        System.out.println("Do-While-Schleife");
        do{
            m = 1/(2*j+1);
            j++;
            System.out.print(Math.rint(m*100)/100 + "\t");
        }while (j < 2*n);
    }
}
