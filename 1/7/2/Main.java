import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n, m = 0;
        do {
            n = scanner.nextInt();
            if (n > 10)
                m += n;
        } while (n % 5 != 0);
        System.out.println(m);
    }
}