import java.util.Locale;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        in.useLocale(Locale.US);
        double x = in.nextDouble();
        double y = in.nextDouble();
        System.out.println(y < 2 - x * x && y > x && x < 0 || y < 2 - x * x && y > 0 && x >= 0 ? "YES" : "NO");
    }
}