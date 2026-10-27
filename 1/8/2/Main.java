import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = scanner.nextInt(), sum = 0;
        boolean f = false;

        for (int i = 0; i < n; i++) {
            int num = scanner.nextInt();
            if (num % 2 == 0) {
                sum += num;
                f = true;
            }
        }

        System.out.println(f ? sum : "NO");
    }
}