import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt(), m = 10;
        while (n > 0) {
            if (n % 10 < m && n % 10 > 0)
                m = n % 10;
            n /= 10;
        }
        System.out.println(m < 10 ? m : "NO");
    }
}