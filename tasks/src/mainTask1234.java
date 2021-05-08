import java.io.IOException;
import java.util.Scanner;

public class mainTask1234 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Введите имя:");
        String name = sc.nextLine();
        System.out.println("Привет, " + name);
        sc.close();

        StringBuffer buf = new StringBuffer("Жыве Беларусь! Жыве вечна!");
        buf.reverse();
        System.out.println(buf);

        System.out.println("1\n2\n3 4 5 6");

        int a = 23;
        int b = 34;
        int c = a + b;
        System.out.println(c);
    }
}