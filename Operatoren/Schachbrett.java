package Operatoren;
/**
 * Created by olechka on 21.01.2017.
 */
public class Schachbrett {
    public static void main(String[] args) {
        int i = 1;
        while (i <= 10) {
            for (int j = 1; j <= 10; j++) {
                int k = j * i;
                System.out.print(k + "\t ");
            }
            i++;
            System.out.println();
        }

    }
}

