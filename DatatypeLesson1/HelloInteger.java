package DatatypeLesson1;

import static java.lang.Math.pow;

/**
 * Created by olechka on 21.01.2017.
 */
public class HelloInteger {
    public static void main(String[] args) {
        //возводим в степень
        int a,b,c,d;
        a=2;
        b=3;
        c=(int) pow(a,b);
        System.out.println(a+ " в степени "+ b +" = " + c);
        d=4; // D-сторона квадрата
        int P = 4*d;
        int A = d*d;
        System.out.println("Периметр квадрата = "+ P);
        System.out.println("Площадь квадрата со стороной "+ d +" = "+A);

    }
}
