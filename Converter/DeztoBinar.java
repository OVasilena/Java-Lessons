package Converter;

/**
 * Comhard2017
 * package Converter
 * Created by olechka on 23.01.2017.
 **/
public class DeztoBinar {
    public static void main(String[] args) {
        int a, b;
        int m;
        a = 375;
        b = a;
        String leer = " ";

        while (b>0) {
            m = b % 2;
            System.out.print("Zahl a=" +b+ " " + m + " Rest" + "\t");
            b = b/2;
            leer = String.valueOf(m) + leer;

        }
        System.out.println("\nDez " +a+ " Binär " + leer);

    }
}
