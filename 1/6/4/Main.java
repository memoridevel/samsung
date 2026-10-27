import java.util.Locale;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        in.useLocale(Locale.US);
        double a = in.nextDouble(), b = in.nextDouble();
        if (a <= 0 && b <= 0)
            System.out.println("no such x");
        else if (a >= 0 && b > 0)
            System.out.println("any x");
        else if (a + b > 0)
            System.out.println(Math.round(b / a * 10) / 10.0 + "<x<" + -Math.round(b / a * 10) / 10.0);
        else
            System.out.println("x<" + Math.round(b / a * 10) / 10.0 + " or x>" + -Math.round(b / a * 10) / 10.0);
    }
}