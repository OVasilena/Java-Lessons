package Operatoren;

/**
 * Created by olechka on 21.01.2017.
 */
public class HelloModulo {
    public static void main(String[] args) {
        int a,b;
        a = 56;
        b = 22;
        int d;
        double c = (double)a / b;
        double zahl;
        zahl = Math.rint(c*100) / 100;// округление до 10²--> 2 числа
        d = a % b; //остаток при делении
        System.out.println(a +" / " + b+ " = " + c);
        System.out.println(a + " Mod " + b + " = " + d);
        System.out.println("gerundet "+ zahl);
    }
}
