package DatatypeLesson1;

/**
 * Comhard2017
 * package DatatypeLesson1
 * Created by olechka on 31.01.2017.
 **/
public class HelloChar {
    public static void main(String[] args) {
        char zahl = 75; // charmap cmd
        System.out.println("Мое число char1 = " + zahl);

        char oktal = '\u028C';
        System.out.println("Мое число char2 = " + oktal);

        char zahl1, zahl2, zahl3;
        zahl1 = '\u041F';
        zahl2 = 'A';
        zahl3= '\u03A6'; // Phi
        System.out.print("Мое число zahl1 = " + zahl1 + "\t число zahl2 = " + zahl2 + "\t число zahl3 = " +zahl3 + "\n");
        System.out.println("\u028C");
    }
}
