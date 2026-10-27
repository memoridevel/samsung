import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = scanner.nextInt(), factorial = 1;

        for (int i = 1; i <= n; i++)
            factorial *= i;

        System.out.println(factorial);
    }
}