import java.util.Scanner;
import java.util.Locale;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = scanner.nextInt(), sum = 0, count = 0;

        for (int i = 0; i < n; i++) {
            int num = scanner.nextInt();
            if (num % 2 != 0) {
                sum += num;
                count++;
            }
        }

        if (count == 0)
            System.out.println("NO");
        else
            System.out.printf(Locale.US, "%.2f\n", (double) sum / count);
    }
}