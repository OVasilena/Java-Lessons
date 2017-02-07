package Uebungen95;

/**
 * Comhard2017
 * package Uebungen95
 * Created by olechka on 05.02.2017.
 * Schachbrett erstellen
 **/
public class Schachbrett421 {

    public static void main(String[] args) {
        int k;
       for (int i = 0; i < 8; i++){
           for (int j = 1; j < 9; j++){
               k = i+j;
               System.out.print(k + "\t");
           }
           System.out.println();
       }
    }
}
