import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt(), max = scanner.nextInt();
        for (int i = 1; i < n; i++) {
            int current = scanner.nextInt();
            if (current > max)
                max = current;
        }

        System.out.println(max);
    }
}