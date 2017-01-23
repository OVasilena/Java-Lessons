package Operatoren;

/**
 * Created by olechka on 21.01.2017.
 */
public class PlusAndMinus {
    public static void main(String[] args) {
        int a, b, c, d;
        a = 5;
        System.out.println("В начале a = " + a);
        b = a ++;
        System.out.println("b = "+ b);
        System.out.println("a = "+ a);
        c = 5;
        System.out.println("В начале c = " + c);
        d = --c;

        System.out.println("В итоге c = " + c);
        System.out.println("В итоге d = " + d);
        a += 1;
        System.out.println("В конце a = " + a);
        a = 3;
        b = a;
        System.out.println(a);
        System.out.println(b);
        while(b == a){
            b--;
            System.out.println(b);
        }
        while(b < 10){
            b++;
            System.out.print(b + " ");
        }
        System.out.println();
        System.out.println(b);
    }
}
