import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        boolean[] seen = new boolean[10];
        boolean f = false;

        while (n > 0) {
            int digit = n % 10;

            if (seen[digit]) {
                f = true;
                break;
            }

            seen[digit] = true;

            n /= 10;
        }

        System.out.println(f ? "YES" : "NO");
    }
}