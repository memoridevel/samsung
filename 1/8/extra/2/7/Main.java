import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = scanner.nextInt(), count = 1, prev = scanner.nextInt();

        for (int i = 1; i < n; i++) {
            int current = scanner.nextInt();

            if (current != prev) {
                count++;
                prev = current;
            }
        }

        System.out.println(count);
    }
}