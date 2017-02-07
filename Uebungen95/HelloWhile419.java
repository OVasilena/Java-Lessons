package Uebungen95;

/**
 * Comhard2017
 * package Uebungen95
 * Created by olechka on 05.02.2017.
 **/
public class HelloWhile419 {
    public static void main(String[] args) {
        for (int i = 0; i < 100; i ++){
            if(i == 74) break; // bei 74 abbruch
            if(i % 9 != 0) continue; //wenn Modulo ungleich 0 - weitermachen
            System.out.println(i); // ausgeben alle zahlen bei teilen auf 9 ohne rest
        }
        System.out.println("Zweite While-Schleife");
        int i = 0;
        while (true){
            i ++;
            int j = i * 30;
            if(j == 1260) break; // abbruch bei 1260
            if(i % 10 != 0) continue;
            System.out.println(i);
        }
    }
}
