import java.util.Locale;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        in.useLocale(Locale.US);
        double x = in.nextDouble();
        double y = in.nextDouble();
        System.out.println(x * x + y * y < 1 || x > 0 && y > 0 && x < 1 && y < 1 ? "YES" : "NO");
    }
}