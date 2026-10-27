import java.util.Locale;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        in.useLocale(Locale.US);
        double x = in.nextDouble();
        double y = in.nextDouble();
        System.out.println(y > 2 * x * x && y > 1 - x && x < 0 || x < 1 && y > 1 - x && x >= 0 ? "YES" : "NO");
    }
}