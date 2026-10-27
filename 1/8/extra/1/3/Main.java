import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = scanner.nextInt();

        for (int i = 0; i < n; i++) {
            System.out.print(i * n + i + 1);
            if (i < n - 1)
                System.out.print(" ");
        }
    }
}