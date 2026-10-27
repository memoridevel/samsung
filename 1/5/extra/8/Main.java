import java.util.Locale;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        in.useLocale(Locale.US);
        double x = in.nextDouble();
        double y = in.nextDouble();
        System.out.println(x > 0 && (y >= 0 && y > x - 1 && y < 1 || y < 0 && x * x + y * y < 1) ? "YES" : "NO");
    }
}