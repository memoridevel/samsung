import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt(), m = 0;
        while (n / 100 == 0 && n / 10 > 0) {
            m += n / 10 + n % 10;
            n = scanner.nextInt();
        }
        System.out.println(m);
    }
}