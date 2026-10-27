import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double a = scanner.nextDouble();
        long n = scanner.nextLong();
        double r = 1.0;
        while (n > 0) {
            if ((n & 1) != 0)
                r *= a;
            a *= a;
            n /= 2;
        }

        System.out.println(r);
    }
}