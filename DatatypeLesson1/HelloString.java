package DatatypeLesson1;

/**
 * Comhard2017
 * package DatatypeLesson1
 * Created by olechka on 31.01.2017.
 **/
public class HelloString {
    public static void main(String[] args) {
        String a = "Я";
        String b = "тебя";
        String c = "1";
        for (int i = 0; i < 10; i++){
            c = c + 1;
            a = a + b + c + 2;
            System.out.println(a);
        }
    }
}
