import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = scanner.nextInt();

        int prev = -1;
        boolean f = false;

        while (n > 0) {
            int i = n % 10;
            if (i == prev) {
                f = true;
                break;
            }
            prev = i;
            n /= 10;
        }

        System.out.println(f ? "YES" : "NO");
    }
}