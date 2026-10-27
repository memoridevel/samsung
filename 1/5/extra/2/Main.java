import java.util.Locale;
import java.util.Scanner;

import static java.lang.Math.PI;
import static java.lang.Math.sin;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        in.useLocale(Locale.US);
        double x = in.nextDouble();
        double y = in.nextDouble();
        System.out.println(y < sin(x) && x > 0 && x < PI && y < 0.5 && y > 0 ? "YES" : "NO");
    }
}