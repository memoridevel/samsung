import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = scanner.nextInt(), expected = n * (n + 1) / 2, actual = 0;
        for (int i = 0; i < n - 1; i++)
            actual += scanner.nextInt();

        System.out.println(expected - actual);
    }
}